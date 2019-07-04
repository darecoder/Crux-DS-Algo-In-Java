package com.company.Lecture14.inheritance;

public abstract class Vehicle {


    private String license;

    public Vehicle(){}

    public Vehicle(String license){
        this.license = license;
    }

    public String getLicense(){
        return license;
    }

    public abstract void pollution();
}
