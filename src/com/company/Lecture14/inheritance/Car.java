package com.company.Lecture14.inheritance;

public class Car extends Vehicle{
    public int doors = 4;
    public int wheels = 4;

    public Car(String license){
        super(license);
    }

    public void start(){
        System.out.println("Start like a generic Car");
    }

    public void start(int speed){
        System.out.println("Start like a generic Car " + speed);
    }

    @Override
    public void pollution() {
        System.out.println("This os how you check pollution");
    }
}
