package com.SpringMVC.FirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping ("/welcome")
    public String home() {
        return "home"; // not "home.jsp" or "/home"
    }
}
