package com.company.Lecture7;

//import javafx.scene.transform.Scale;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bitwise_Examples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        String[] any = s.nextLine().trim().split(" ");
//        int[] nums = new int[any.length];
//        for (int i = 0; i < any.length ; i++) {
//            nums[i] = Integer.parseInt(any[i]);
//        }
//        System.out.println(Arrays.toString(nums));
//        System.out.println(5 & 11);
//        System.out.println(5 | 11);

//        int[] num2 = {2,1,8,1,8,2};
//        int res = oddOcc(num2);
//        System.out.println(res);
//
//        System.out.println(countOne(15));
//        toggle_basic(14);
//        toggle(14);
        System.out.println(power(3,2));

    }

    public static int oddOcc(int[] nums){
        int res = 0;
        for (int i = 0; i < nums.length ; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public static boolean isOdd( int  n){
        return (n & 1) == 0;    //If returns 1 : odd else even.
    }

    public static int countOne(int n){
        int cnt = 0;
        while(n > 0){
            if((n & 1) == 1) {
                cnt++;
            }
            n = n >>1;

        }
        return cnt;
    }

    public static void toggle_basic (int n){
        int num = 0,place=1;
        while(n>0){
            if((n & 1)==0){
                num = num + 1*place;
            }
            place *= 2;
            n = n >> 1;
        }
        System.out.println(num);
    }

    public static void mul7(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] << 3) - nums[i];
        }
    }

    public static void toggle(int num){
        int index = 0, t = 0;
        while(num > 0){
            int d = (num & 1) ^ 1;
            t = t + (d << index);
            index++;
            num = num >> 1;
        }
        System.out.println(t);
    }

    public static int power(int x, int n){
        int res = 1;

        while ( n > 0){
            if((n&1) == 1){
                res = res * x;
            }
            x = x*x;
            n = n >> 1;
        }
        return res;
    }
}
