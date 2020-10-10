package com.company.Lecture8;

public class RecursionExamples {
    public static void main(String[] args) {
        System.out.println("Power : "+ power(3,3));
        System.out.println("factorial : " + factorial(4));
        System.out.println("Fibonacci : " + fibo(7));
        System.out.println("Sum of n numbers : " + sum(3));
    }

    public static int power(int x,int n){
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }
        if(n == 0){
            return 1;
        }
        int res;
        res = x * power(x, n-1);
        return res;
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        return n * factorial(n-1);
    }

    public static int fibo(int n){
        if (n  < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        return(n + sum(n-1));
    }

}
