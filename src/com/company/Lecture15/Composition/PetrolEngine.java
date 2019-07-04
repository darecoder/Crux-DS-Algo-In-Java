package com.company.Lecture15.Composition;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Start like a petrol Car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like a petrol Car");
    }
}
