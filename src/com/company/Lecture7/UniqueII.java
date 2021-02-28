package com.company.Lecture7;

import java.util.Scanner;

public class UniqueII {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        get2NonRepeatingNos(arr);
    }

    public static void get2NonRepeatingNos(int[] arr)
    {
        int Xor = arr[0], res, i, x = 0, y;
        for(i = 1; i < arr.length; i++) {
            Xor ^= arr[i];
        }

        res = Xor;
        int pos = 0;
        while ((Xor & 1) != 1){
            pos++;
            Xor = Xor >> 1;
        }

        int mask = (1 << pos);
        for(int num : arr) {
            if ((num & mask) == 1) {
                x = x ^ num;
            }
        }

        y = res ^ x;
        System.out.println(x + " " + y);
    }
}
