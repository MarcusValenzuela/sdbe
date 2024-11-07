package com.sundevilbookexchange.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") // Root URL
public class HomeController {

    @GetMapping
    public String home() {
        return "index"; // This will map to the index.html file
    }
}
