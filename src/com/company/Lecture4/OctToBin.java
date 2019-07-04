package com.company.Lecture4;

import java.util.Scanner;

public class OctToBin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int place = 1, val ,res = 0;

        while (n > 0){
            int r = n % 10;
            System.out.println(r);
            if( r == 0){
                val = 0;
            } else if( r == 1){
                val = 1;
            }  else if( r == 2){
                val = 10;
            }  else if( r == 3){
                val = 11;
            }  else if( r == 4){
                val = 100;
            }  else if( r == 5){
                val = 101;
            }  else if( r == 6){
                val = 110;
            }  else{
                val = 111;
            }
            System.out.println(val);
            res = res + val*place;
            System.out.println(res);
            place *= 1000;
            n /= 10;
        }

        System.out.println(res);
    }
}
