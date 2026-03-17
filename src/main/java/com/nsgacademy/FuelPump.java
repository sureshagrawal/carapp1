package com.nsgacademy;

import org.springframework.stereotype.Component;

@Component
public class FuelPump {
    public void pump() {
        System.out.println("Fuel pump working...");
    }
}