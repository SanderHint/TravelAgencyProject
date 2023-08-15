package controller;


import Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/booking") // Specify the base URL mapping for this controller
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // This method will handle GET requests to "/booking" URL
    @RequestMapping(method = RequestMethod.GET)
    public String showBookingPage() {
        // You can add logic here to fetch data from the bookingService
        // and pass it to the view

        // Return the logical view name of your booking page
        return "bookingPage"; // This assumes you have a view named "bookingPage.jsp" or similar
    }
}
