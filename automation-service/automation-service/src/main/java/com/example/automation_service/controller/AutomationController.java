package com.agms.automationservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/automation")
public class AutomationController {

    @PostMapping("/process")
    public String process(@RequestBody Map<String, Object> data) {

        double temp = Double.parseDouble(data.get("temperature").toString());

        if (temp > 32) {
            return "TURN_FAN_ON";
        } else if (temp < 20) {
            return "TURN_HEATER_ON";
        }

        return "NO_ACTION";
    }
}