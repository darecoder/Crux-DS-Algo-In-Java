package com.company.Lecture7;

import java.util.Scanner;

public class Pattern_Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        diamond(n);
//        diamond_out(n);
        pascal(n);
    }

    public static void diamond(int n){
        int space = n-1;
        int star = 1;
        for (int i = 0; i < 2*n-1 ; i++) {
            for (int j = 0; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if (i < n - 1) {
                star -= 1;
                space += 2;
            } else {
                star += 1;
                space -= 2;
            }

            System.out.println();
        }
    }

    public static void diamond_out( int n){
        int space = 0;
        int star = n-1;
        for (int i = 0; i < 2*n-3 ; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }
            if (i < n - 2) {
                star -= 1;
                space += 2;
            } else {
                star += 1;
                space -= 2;
            }

            System.out.println();
        }
    }

    public static void pascal(int num){
        for (int n = 0; n < num ; n++) {
            int val = 1;
            for (int r = 0; r <= n ; r++) {
                System.out.print(val + " ");
                val = val * (n-r) / (r+1);
//                val = fact(n)/ (fact(r)* fact(n-r));
            }
            System.out.println();
        }
    }

    public static int fact(int n){
        int acc = 1;

        for (int i = 1; i <= n ; i++) {
            acc = acc * i;
        }
        return acc;
    }
}
