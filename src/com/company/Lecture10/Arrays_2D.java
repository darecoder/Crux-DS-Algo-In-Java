package com.company.Lecture10;

public class Arrays_2D {
    public static void main(String[] args) {
        int[][] nums = new int[6][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length ; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }

        int[][] nums2 = new int[4][];

//        for (int i = 0; i < nums2.length ; i++) {
//            System.out.println(nums2[i]);
//        }

        for (int i = 0; i < nums2.length ; i++) {
            nums2[i] = new int[i+1];
        }
//     int[][] nums = new int[6][5];

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[i].length ; j++) {
//                System.out.print(nums[i][j]);
//            }
//            System.out.println();
//        }

//        int[][] nums2 = new int[4][];
//
////        for (int i = 0; i < nums2.length ; i++) {
////            System.out.println(nums2[i]);
////        }
//
//        for (int i = 0; i < nums2.length ; i++) {
//            nums2[i] = new int[i+1];
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.println(nums2[i].length);
//        }
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i].length);
        }

//        long r = 100000;
//        long n = (long)(r*(r+1)/2.0);
//        System.out.println(n);
    }

}
