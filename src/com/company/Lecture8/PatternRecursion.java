package com.company.Lecture8;

import com.company.Lecture5.ArrayIntro;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PatternRecursion {
    public static void main(String[] args) {
        pattern1(5,0);
        pattern2(5,0);
//        int[] nums = {2,7,1,0,4,8,3};
//        bubbleSort(nums,nums.length-1,0);
//        System.out.println(Arrays.toString(nums));
    }

    public static void pattern1(int row, int col){
        if(row == 0){
            return;
        }
        if(row == col){
            System.out.println();
            pattern1(row-1,0);
            return;
        }
        System.out.print("*");
        pattern1(row, col+1);

    }

    public static void pattern2(int row, int col){
        if(row == 0){
            return;
        }
        if(row == col){
            pattern2(row-1,0);
            System.out.println();
            return;
        }
        pattern2(row, col+1);
        System.out.print("*");
    }

    public static void bubbleSort(int[] nums, int row, int col){
        if(row == 0){
            return;
        }

        if(row == col){
            bubbleSort(nums, row-1, 0);
            return;
        }

        if(nums[col] > nums[col+1]){
            ArrayIntro.swap(nums, col, col+1);
        }

        bubbleSort(nums, row, col+1);
    }
}
