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

    @GetMapping("/")
    public String showHomepage(Model model) {
        model.addAttribute("promotedTrips", homeService.getPromotedTrips());
        model.addAttribute("upcomingTours", homeService.getUpcomingToursGlobally());

        return "index";
    }
    @GetMapping
    public String redirectToHomepage() {
        return "redirect:/home/";
    }
}