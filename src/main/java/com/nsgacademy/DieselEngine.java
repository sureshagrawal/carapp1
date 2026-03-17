package com.nsgacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine{
    @Autowired
    private FuelPump fuelPump;

    @Override
    public void start() {
        fuelPump.pump();
        System.out.println("Diesel engine started...");
    }
}
