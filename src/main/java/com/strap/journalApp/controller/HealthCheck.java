package com.strap.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/health-check") public String healthcheck(){
        return  "Let me get over this ";
    }
}
