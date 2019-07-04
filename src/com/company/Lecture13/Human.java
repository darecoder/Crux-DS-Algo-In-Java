package com.company.Lecture13;

public class Human {
    public String name;   //instance variable
    public int age;
    public int balance = 1000;
    public static int population = 0;

    public Human(){
        population++;
    }

    public Human(Human another){
        this.name =another.name;
        this.age = another.age;
        this.balance = another.balance;
    }

    public Human(String name, int age, int balance){  //local variable inside ()
        this.name = name;
        this.age = age;
        this.balance = balance;
        population++;
    }

    public void udhaar(){
        if(balance >= 100){
            balance = balance - 100;
        }else{
            System.out.println("Bhai kangaal ho rakha hun :/");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        population--;
    }
}
