package com.nsgacademy;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    public void supplyPower(){
        System.out.println("Battery supplying power...");
    }
}
