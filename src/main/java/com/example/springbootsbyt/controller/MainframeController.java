package com.example.springbootsbyt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
    public class MainframeController {

    @GetMapping("/")
    public String greeting() {
        return "home";
    }

    @GetMapping("/main")
    public String mainFrame() {
        return "main-frame";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
