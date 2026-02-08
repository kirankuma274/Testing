package org.example.valentine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoveController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/reasons")
    public String reasons() {
        return "reasons";
    }

    @GetMapping("/proposal")
    public String proposal() {
        return "proposal";
    }

    @GetMapping("/yes")
    public String yes() {
        return "yes";
    }
}
