package com.nsgacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Car {
    @Autowired
    Battery battery;

    @Autowired
    @Qualifier("dieselEngine")
    Engine engine;

    @Autowired
    List<Tyre> tyres;

    public void drive(){
        battery.supplyPower();
        engine.start();

        for(Tyre tyre : tyres)
            tyre.rotate();

        System.out.println("Car is running");
    }

    @Override
    public String toString() {
        return "Car{" +
                "battery=" + battery +
                ", engine=" + engine +
                ", tyres=" + tyres +
                '}';
    }
}
