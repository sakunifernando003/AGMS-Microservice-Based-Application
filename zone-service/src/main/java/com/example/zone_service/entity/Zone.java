package com.agms.zoneservice.entity;

public class Zone {
    private String id;
    private String name;
    private double minTemp;
    private double maxTemp;

    public Zone() {}

    public Zone(String id, String name, double minTemp, double maxTemp) {
        this.id = id;
        this.name = name;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

  
}