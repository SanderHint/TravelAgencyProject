package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Service.HomeService;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    // Implement request mappings for handling requests related to the home page and its functionalities
    // For example, mapping to retrieve promoted trips and upcoming tours

    @GetMapping("/")
    public String showHomepage(Model model) {
        // Implement the logic to retrieve data or perform any necessary operations
        // You can call methods from the `homeService` to fetch data

        // Add data to the model to be used in the view
        model.addAttribute("promotedTrips", homeService.getPromotedTrips());
        model.addAttribute("upcomingTours", homeService.getUpcomingToursGlobally());

        // Return the name of the view/template to render (e.g., "home.html")
        return "home";
    }
}