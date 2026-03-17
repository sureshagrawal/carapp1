package com.nsgacademy;

import org.springframework.stereotype.Component;

public class Tyre {
    private String name;

    public Tyre(){

    }

    public Tyre(String name){
        this.name = name;
    }

    public void rotate(){
        System.out.println(name+" Tyre is rotating...");
    }
}
