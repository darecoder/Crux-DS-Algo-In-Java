package com.company.Lecture7;

public class UniqueI {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,1,5,2};

        System.out.println(getSingle(nums));
    }


    private static int getSingle(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }

        return res;
    }
}
