package com.agms.zoneservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/zones")
public class ZoneController {

    @GetMapping
    public String getZones() {
        return "All zones";
    }

    @PostMapping
    public String createZone() {
        return "Zone created";
    }

    @GetMapping("/{id}")
    public String getZone(@PathVariable String id) {
        return "Zone " + id;
    }

    @PutMapping("/{id}")
    public String updateZone(@PathVariable String id) {
        return "Zone updated " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteZone(@PathVariable String id) {
        return "Zone deleted " + id;
    }
}