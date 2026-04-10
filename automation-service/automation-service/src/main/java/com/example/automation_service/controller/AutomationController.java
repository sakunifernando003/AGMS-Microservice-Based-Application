package com.agms.automationservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/automation")
public class AutomationController {

    @PostMapping("/process")
    public String process() {
        return "Processing automation rules";
    }

    @GetMapping("/logs")
    public String logs() {
        return "Automation logs";
    }
}