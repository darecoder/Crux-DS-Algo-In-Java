package com.company.Lecture13;

public class Client {
    public static void main(String[] args) {
        Human ekta = new Human("Ekta" ,19,1000);
        Human ankit = new Human(ekta);    //copy constructor

        System.out.println(ankit.name);
//        System.out.println(ekta.name);
//        System.out.println(ekta.age);

//        ekta.name = "Ekta Mishra";
//        ekta.age = 19;

        System.out.println(ekta.name);
        System.out.println(ekta.age);

//        for (int i = 0; i < 11 ; i++) {
//            ekta.udhaar();
//            System.out.println(ekta.balance);
//        }
//
//        System.out.println(ekta.population);
    }
}
