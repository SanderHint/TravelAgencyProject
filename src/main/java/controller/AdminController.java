package controller;


import Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
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

//@RestController
//@RequestMapping("/admin")
//public class AdminController {
//
//    private final AdminService adminService;
//
//    public AdminController(AdminService adminService) {
//        this.adminService = adminService;
//    }
