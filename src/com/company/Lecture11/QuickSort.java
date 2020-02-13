package com.company.Lecture11;

import com.company.Lecture5.ArrayIntro;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4,8,1,7,2,0,3};
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quicksort(int[] nums,int start, int end){
        if(start >= end){
            return;
        }

        int p = pivot(nums,start,end);

        quicksort(nums,start,p-1);
        quicksort(nums,p+1,end);

    }

    public static int pivot(int[] nums,int start,int end){
        int j=start;
        for (int i = start; i <= end; i++) {
            if(nums[i] < nums[end]) {
                ArrayIntro.swap(nums, i, j);
                j++;
            }
        }
        ArrayIntro.swap(nums, end,j);
        return j;
    }
}
