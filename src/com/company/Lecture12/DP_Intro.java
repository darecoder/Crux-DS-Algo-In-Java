package com.company.Lecture12;

import java.math.BigInteger;

public class DP_Intro {
    public static void main(String[] args) {
        int n = 10;
        BigInteger[] mem = new BigInteger[n+1];
        BigInteger res = DP_fibo2(n,mem);
        System.out.println(res);

        Integer[] memory = new Integer[n+1];       //Wrapper Class -> Integer
        System.out.println(DP_fibo(n,memory));

        System.out.println(fiboDPitr(n,memory));    //Dynamic Programming using Iterative approach
    }

    public static int fibo(int n){
        if( n < 2){
            return n;
        }

        return (fibo(n-1) + fibo(n-2));
    }

    public static int DP_fibo(int n,Integer[] memory){       //Dynamic Programming
        if( n < 2){
            return n;
        }

        if(memory[n] != null){
            return memory[n];
        }

        memory[n] = (DP_fibo(n-1,memory) + DP_fibo(n-2,memory));
        return memory[n];
    }

    public static BigInteger DP_fibo2(int n,BigInteger[] memory){
        if( n < 2){
            return new BigInteger(Integer.toString(n));
        }

        if(memory[n] != null){
            return memory[n];
        }

        memory[n] = (DP_fibo2(n-1,memory).add(DP_fibo2(n-2,memory)));
        return memory[n];
    }

    public static int fiboDPitr(int n,Integer[] memory){  //Dynamic Programming using Iterative approach
        for (int i = 0; i <= n ; i++) {
            if(i < 2){
                memory[i] = i;
            }else{
                memory[i] = memory[i-1] + memory[i-2];
            }
        }
        return memory[n];
    }
}
