package com.company.Lecture3;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int r1 = s.nextInt();
        int r2 = s.nextInt();
        int res = AnyToAny(n,r1,r2);
        System.out.println(res);

    }

    public static int DecToAny ( int dec, int base){
        int any = 0, place = 1;
        while( dec > 0){
            int r = dec % base;
            any = any + r * place;
            place *= 10;
            dec /= base;
        }

        return any;
    }

    public static int AnyToDec ( int any, int base ){
        int val = 0, place = 1;
        while( any > 0){
            int r = any % 10;
            val = val + r * place;
            place *= base;
            any /= 10;
        }

        return val;
    }

    public static int AnyToAny( int n, int r1, int r2){
        int val1 = AnyToDec( n, r1);
        int val2 = DecToAny( val1, r2);

        return val2;
    }
}
