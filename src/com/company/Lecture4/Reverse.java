package com.company.Lecture4;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int num = 0,r;
        while (n > 0){
            r = n % 10;
            num = num*10 + r;
            n /=10;
        }
        System.out.println(num);
    }
}
