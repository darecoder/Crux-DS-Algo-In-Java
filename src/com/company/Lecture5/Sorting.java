package com.company.Lecture5;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = {23,45,56,12,8,73};

        bubble(nums);
        selection(nums);

        ArrayIntro.display(nums);

    }

    public static void bubble( int[] nums ){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if( nums[j] > nums[j+1]){
                    ArrayIntro.swap(nums, j, j+1);
                }
            }
        }
    }

    public static void selection( int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
               int m = ArrayIntro.maxIndex(nums, 0, nums.length-1-i);

               ArrayIntro.swap(nums,m, nums.length-1-i);
            }
        }
    }

}
