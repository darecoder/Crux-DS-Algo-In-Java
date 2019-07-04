package com.company.Doubts;

import java.util.Scanner;

public class DivisibleSubarrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = s.nextInt();
            }

            System.out.println(countSubarray(nums));
        }
    }

    public static long countSubarray(int[] nums) {
        long[] rem = new long[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % nums.length;
            while (sum < 0) {
                sum += nums.length;
            }
            rem[sum]++;    //increment the respective remainder indices
        }

        long cnt = rem[0] * (rem[0] + 1) / 2;
        for (int i = 1; i < nums.length; i++) {
            cnt += (rem[i] * (rem[i] - 1)) / 2;
        }
        return cnt;
    }
}