package com.company.Lecture15.Composition;

public class GenericBrake implements Brake {
    @Override
    public void apply() {
        System.out.println("Brake like a Generic Car");
    }
}
