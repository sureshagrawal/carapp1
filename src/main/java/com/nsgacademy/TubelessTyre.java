package com.nsgacademy;

public class TubelessTyre implements Tyre {

    private String name;

    public TubelessTyre(String name) {
        this.name = name;
    }

    public void rotate() {
        System.out.println(name + " - Tubeless tyre rotating");
    }
}