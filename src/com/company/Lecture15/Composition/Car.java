package com.company.Lecture15.Composition;

public class Car {
    private Engine engine;
    private Brake brake;

    public Car(){
        engine = new PetrolEngine();
        brake = new GenericBrake();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        brake.apply();
        engine.stop();
    }

    public void upgrade(Engine engine){
        this.engine = engine;
    }

}
