package com.company.Lecture8;

import java.util.Arrays;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] nums = {2,3,7,9,2,8,4,2,0};
//        System.out.println(find(nums, 7,0));
//        int res = findIndex(nums, 7,0);
//        if (res != -1){
//            System.out.println(res);
//        }
//        System.out.println(findSorted(nums,0 ));
//        System.out.println(Arrays.toString(allIndex(nums,2,0,0)));
//        pattern1(6);
        pattern2(5,0,0);
    }
    public static boolean find(int[] nums, int target, int index){
        if(index == nums.length){
            return false;
        }
        if(nums[index] == target){
            return true;
        }

        return find(nums, target, index+1);
    }

    public static int findIndex(int[] nums, int target, int index){
        if(index == nums.length){
            System.out.println("Element not found!!");
            return -1;
        }
        if(nums[index] == target){
            return index;
        }

        return findIndex(nums, target, index+1);
    }

    public static boolean findSorted(int[] nums, int index){
        if(index == nums.length - 1){
            return true;
        }
        if(nums[index] > nums[index+1]){
            return false;
        }

        return findSorted(nums,index+1);
    }

    public static int[] allIndex(int[] nums, int target, int index, int cnt){
        if(index == nums.length){
            int[] sol = new int[cnt];
            return sol;
        }

        if(nums[index] == target){
            int[] sol =  allIndex(nums,target,index+1, cnt+1);
            sol[cnt] = index;
            return sol;
        }

        return allIndex(nums,target,index+1,cnt);
    }

    public static void pattern1(int n){
        if(n==0){
            return;
        }

        linestar(n-1);
        System.out.println();
        pattern1(n-1);

    }

    public static void linestar(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        linestar(n-1);
    }

    public static void pattern2(int n, int row, int col){
        if(n == row){
            return;
        }

        if(row == col){
            System.out.println("* ");
            pattern2(n,row+1,0);
            return;
        }

        System.out.print("* ");
        pattern2(n,row,col+1);
    }
}
