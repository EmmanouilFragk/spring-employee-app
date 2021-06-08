package gr.qnr.employee.interview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(value = "")
    public String home() {
        return "home";
    }
}
