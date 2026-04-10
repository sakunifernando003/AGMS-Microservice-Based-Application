package com.agms.cropservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crops")
public class CropController {

    @GetMapping
    public String getCrops() {
        return "All crops";
    }

    @PostMapping
    public String addCrop() {
        return "Crop added";
    }

    @PutMapping("/{id}/status")
    public String updateStatus(@PathVariable String id) {
        return "Crop status updated " + id;
    }
}