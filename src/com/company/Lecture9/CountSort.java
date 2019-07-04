package com.company.Lecture9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] nums = {0,1,0,0,1,0,1};
        zeroOneSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void zeroOneSort(int[] nums){

        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeros++;
            }
        }

        for (int i = 0; i < zeros ; i++) {
            nums[i] = 0;
        }

        for (int i = zeros; i < nums.length; i++) {
            nums[i] = 1;
        }
    }
}
