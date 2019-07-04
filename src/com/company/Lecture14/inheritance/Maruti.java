package com.company.Lecture14.inheritance;

public class Maruti extends Car {
    public Maruti(String license){
        super(license);
    }

    public int doors = 5;

    @Override
    public void start() {
        System.out.println("Start like all new Maruti benz");
    }
}
