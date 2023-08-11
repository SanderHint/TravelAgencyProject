package Service;

import models.Tour;
import repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    private final TourRepository tourRepository;
    // Other dependencies

    @Autowired
    public TourService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
        // Initialize other dependencies
    }

    public List<Tour> getAllTours() {


        return null;
    }
}
