package controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class CustomErrorController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(Exception ex) {
        // Custom error handling logic
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        // Add any necessary error information to the model
        modelAndView.addObject("errorMessage", "An error occurred");
        return modelAndView;
    }
}