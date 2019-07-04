package com.company.Lecture3;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.println(inverse(n));
    }

    public static int power( int x, int n){
        int res = 1;

        while ( n > 0){
            res *= x;
            n--;
        }
        return res;
    }

    public static int inverse ( int n){
        int pos = 1, val, res = 0;
        while( n > 0){
            val = n % 10;
            res = res + (pos * power( 10, val-1));
            n /= 10;
            pos++;
        }
        return res;
    }

    public static boolean mirror ( int num){
        return num ==inverse(num);
    }
}
