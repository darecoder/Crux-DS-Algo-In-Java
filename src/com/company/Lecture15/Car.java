package com.company.Lecture15;

public class Car {

    public int a;
    private int b;
    protected int c;
    int d;
    public void run(){
        System.out.println("Bhaago!!");
    }

    protected void run_protected(){
        System.out.println("Bhaago!!");
    }

    private void run_private(){
        System.out.println("Bhaago!!");
    }

    void run_default(){
        System.out.println("Bhaago!!");
    }

}
