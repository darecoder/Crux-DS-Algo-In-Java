package com.company.Lecture14.inheritance;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Car myCar = new Car("45678");
        System.out.println(myCar.doors);

        Maruti myMaruti = new Maruti("56789");
        System.out.println(myMaruti.doors);

        myCar.start();
        myMaruti.start();

        Car c = new Maruti("46789");
        c.start();

        Vehicle v = new Car("45678");

        System.out.println(v.getLicense());
//        int m = max( 7, 23, 765, 75, 435);

        Car car = new Car("5678654");
    }

//    public static int max(int... items){
//        System.out.println(Arrays.toString(items));
//    }
}
