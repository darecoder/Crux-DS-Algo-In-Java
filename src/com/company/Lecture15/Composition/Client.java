package com.company.Lecture15.Composition;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.stop();

        //Upgarde the engine

        NitroEngine e = new NitroEngine();
        car.upgrade(e);

        car.start();
        car.stop();

    }
}
