package com.company.Lecture4;

import java.util.Scanner;

public class BinToDec {
        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);

            int n = s.nextInt();
            int place = 1;
            int r, res = 0;
            while (n > 0) {
                r = n % 10;
                res += r * place;
                place *= 2;
                n /= 10;
            }
            System.out.println(res);
        }
}
