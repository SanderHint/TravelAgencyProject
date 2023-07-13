package Controller;


import Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // Implement request mappings for handling requests related to managing the tour offer and configuring database entities
    // For example, mapping for adding/editing tours or managing continents, countries, cities, airports, hotels
}