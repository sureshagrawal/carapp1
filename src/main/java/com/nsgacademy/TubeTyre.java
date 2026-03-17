package com.nsgacademy;

public class TubeTyre implements Tyre {

    private String name;

    public TubeTyre(String name) {
        this.name = name;
    }

    public void rotate() {
        System.out.println(name + " - Tube tyre rotating");
    }
}