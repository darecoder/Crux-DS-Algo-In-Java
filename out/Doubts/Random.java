package com.company.Doubts;

import java.util.Scanner;

public class Random{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int m = s.nextInt();
            Integer[] mem = new Integer[n+1];
            System.out.println(tillingDP(n,m,mem));
        }
    }

    public static int tilling(int n, int m){
        if(n < m){
            return 1;
        }
        if(n == m){
            return 2;
        }

        return tilling(n-1,m) + tilling(n-m,m);
    }

    public static int tillingDP(int n, int m, Integer[] mem){
        for (int i = 1; i <= n; i++) {
            if(i < m){
                mem[i] = 1;
            } else if (i == m){
                mem[i] = 2;
            } else {
                mem[i] = mem[i-1] + mem[i-m];
                mem[i] %= 1000000007;
            }
        }
        return mem[n];
    }
}




