package com.agms.sensorservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    @GetMapping("/latest")
    public String getLatest() {
        return "Latest sensor data";
    }
}