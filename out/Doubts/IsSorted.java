package com.company.Doubts;

import java.util.Scanner;
import java.util.*;

public class IsSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(power(a,b,c));
    }

    public static int power(int x, int y, int p)
    {
        int res = 1;      // Initialize result
        x = x % p;
        while (y > 0)
        {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y>>1; // y = y/2
            x = (x*x) % p;
        }
        return res;
    }

}







