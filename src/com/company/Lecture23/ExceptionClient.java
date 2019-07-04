package com.company.Lecture23;

public class ExceptionClient {
    public static void main(String[] args) {
//        Exception exception = new Exception("Hey! I'm Exception");
//
//        throw exception;
//        try {
//            danger();
//        }catch (Exception e){
//            System.out.println("Koi nhi yrr");
//        }

        ThreadExample one = new ThreadExample();
        ThreadExample two = new ThreadExample();
//      For Parallel process
        one.start();
        two.start();
//      For Multi Process
        one.run();
        two.run();

    }

    public static void danger() throws Exception{
        Exception exception = new Exception("Hey! I'm Exception");
        throw exception;
    }
}
