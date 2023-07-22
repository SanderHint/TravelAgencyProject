package controller;

import Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
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

    @GetMapping
    public String showHomepage() {
        // Implement the logic to retrieve data or perform any necessary operations
        // You can call methods from the `homeService` to fetch data

        // Return the name of the view/template to render (e.g., "home.html")
        return "home";
    }
}

