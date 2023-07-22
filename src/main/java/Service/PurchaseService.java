package Service;

import repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class PurchaseService {
        private final TourRepository tourRepository;
        // Other dependencies

        @Autowired
        public PurchaseService(TourRepository tourRepository) {
            this.tourRepository = tourRepository;
            // Initialize other dependencies
        }

        // Implement business logic for purchasing tours, calculating the final amount, and managing purchased tours
    }