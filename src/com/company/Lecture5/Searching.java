package com.company.Lecture5;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {23, 54, 78, 34};
        int n = s.nextInt();
//        int ind = linear(nums, n);
        int ind = binary(nums, n);
        if( ind != -1){
            System.out.println("Number found at Index : " + ind);
        }
        else{
            System.out.println("Number not found!!");
        }
    }

    public static int linear( int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] == target)
                return i;
        }
        return -1;
    }

    public static int binary ( int[] nums, int target){
        int start = 0;
        int end =  nums.length-1;
        while ( start <= end ){
            int mid = (start + end)/2;
            if ( target ==  nums[mid]){
                return mid;
            }
            else if( target < nums[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
