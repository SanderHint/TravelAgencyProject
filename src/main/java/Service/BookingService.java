package Service;

import models.Tour;
import models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookingRepository;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public Booking createBooking(Tour tour, int numAdults, int numChildren) {
        double amount = calculateAmount(tour, numAdults, numChildren);

        Booking booking = new Booking(tour, numAdults, numChildren, amount);
        return bookingRepository.save(booking);
    }

    private double calculateAmount(Tour tour, int numAdults, int numChildren) {
        // Implement your calculation logic here
        return 0.0; // Replace with actual calculation
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll(); // Return a list of Booking objects
    }
}