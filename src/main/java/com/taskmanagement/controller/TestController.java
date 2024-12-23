package com.taskmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        System.out.println("Test endpoint hit"); // Add logging
        return "Test endpoint is working!";
    }
}