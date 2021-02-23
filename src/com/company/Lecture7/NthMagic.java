package com.company.Lecture7;

import java.util.Scanner;

public class NthMagic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(nthMagical(n));
    }

    public static int nthMagical(int n) {
        int res = 0;
        int place = 1;
        while (n > 0){
            if ((n & 1 ) == 1){
                res = res + (int) Math.pow(5, place);
            }

            n = n >> 1;
            place++;
        }

        return res;
    }
}
