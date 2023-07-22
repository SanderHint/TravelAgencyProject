package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
@ComponentScan
public class ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Custom error handling logic or redirect to an error page
        return "error.html";
    }
}