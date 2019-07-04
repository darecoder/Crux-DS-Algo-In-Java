package com.company.Lecture4;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int cnt = 0;
        while(n > 0){
            int r = n % 10;
            if( r == 5){
                cnt++;
            }
            n/= 10;
        }
        System.out.println(cnt);
    }
}
