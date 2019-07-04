package com.company.Lecture4;

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int place = 1,res = 0;

        while(n > 0){
            int r = n % 2;
            res = res + r*place;
            place*=10;
            n/= 2;
        }
        System.out.println(res);
    }
}
