package com.company.Lecture15.Composition;

public class NitroEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start like nito SuperCar");
    }

    @Override
    public void stop() {
        System.out.println("Stop like nitro SuperCar");
    }
}
