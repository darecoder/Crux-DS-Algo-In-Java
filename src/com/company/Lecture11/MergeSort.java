package com.company.Lecture11;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3,8,1,9,2};
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] mergeSort(int[] nums){
        if(nums.length < 2){
            return nums;
        }

        int mid = nums.length/2;

        int[] first = Arrays.copyOfRange(nums,0,mid);
        int[] second = Arrays.copyOfRange(nums,mid,nums.length);

        first = mergeSort(first);
        second = mergeSort(second);

        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second){
        int i=0,j=0,k=0;
        int[] res = new int[first.length+second.length];


        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                res[k++] = first[i++];
            }else{
                res[k++] = second[j++];
            }
        }
        while(i < first.length){
            res[k++] = first[i++];
        }
        while(j < second.length){
            res[k++] = second[j++];
        }
        return res;
    }
}
