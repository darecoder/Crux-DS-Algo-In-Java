package com.company.Lecture15;

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.a = 1;
//        c.b = 2;
        c.c = 3;
        c.d = 4;

        c.run();
        c.run_protected();
//        c.run_private();
        c.run_default();
    }
}
