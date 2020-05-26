package danilov.roman.jenkinsTest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainGet() {
        return "index";
    }

    @GetMapping("/test")
    public String testGet() {
        return "index";
    }
}
