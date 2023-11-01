package com.domain.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WellcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring Boot Rest Api";
    }
}
