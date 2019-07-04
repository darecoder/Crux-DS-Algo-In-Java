package com.company.Lecture6;

import com.company.Lecture5.ArrayIntro;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] nums = {4,5,1,3,2,0};

//        reverse(nums);
        nums = inverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse ( int[] nums){
        for (int i = 0; i < nums.length/2 ; i++) {
            ArrayIntro.swap(nums, i, nums.length - 1 - i);
        }
    }

    public static int[] inverse ( int[] nums){
        int[] num2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num2[nums[i]] = i;
        }
        return num2;
    }
}
