package com.company.Lecture7;

public class RecursionIntro {
    public static void main(String[] args) {

        pd(5);
        System.out.println();
        pi(5);

    }

    public static void pd(int n){
        if(n==0){
            return;
        }

        System.out.print(n + " ");
        pd(n-1);

    }

    public static void pi(int n){
        if(n==0){
            return;
        }

        pi(n-1);
        System.out.print(n + " ");

    }

}
