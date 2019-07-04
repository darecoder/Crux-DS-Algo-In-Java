package com.company.Lecture5;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int[] n = new int[10];
        int n = s.nextInt();
        int[] nums = input(n, s);

        int max = maxIndex(nums, 0, 5);
        System.out.println(max);
//        swap(nums,3,0);
//        display(nums);

    }


    public static void display (int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();
    }

    public static int[] input (int n, Scanner s){
        int[] nums = new int[n];

        for (int i = 0; i < n ; i++) {
            nums[i] = s.nextInt();
        }

        return nums;
    }

    public static void swap(int[] nums, int ind1, int ind2 ){
        int t;
        t = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = t;
    }

    public static int maxIndex (int[] nums, int start, int end){
        int max = start;
        for (int i = start; i <= end ; i++) {
            if( nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }

    public static void shift(int[] nums,int end){
        for (int i = 0; i < end ; i++) {
            nums[i] = nums[i+1];
        }
    }

}
