package com.company.Lecture23;

import java.util.Scanner;

public class ScannerExmple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    }

    public static void input(){
        Scanner s  = new Scanner(System.in);

        String line = s.nextLine();

        Scanner temp = new Scanner(line);

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp.nextInt();                //Reading from String line
        }
    }
}
