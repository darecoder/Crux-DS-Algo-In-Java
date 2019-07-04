package com.company.Lecture10;

import com.company.Lecture5.ArrayIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary {
    public static void main(String[] args) {
        String line = "aab";
        int[] nums = freq(line);
//        System.out.println(Arrays.toString(nums));

//        lexo("",nums,line.length());
        lexoNum(0,15);
    }

    public static int[] freq(String chars){
        int[] nums = new int[26];
        for (int i = 0; i < chars.length() ; i++) {
            if(chars.charAt(i) >=97 || chars.charAt(i) <=122){
                nums[chars.charAt(i) - 'a']++;
            }
        }
        return nums;
    }

    public static void lexo(String proc, int[] f, int length){
        if(length == 0){
            System.out.println(proc);
            return;
        }

        for (int i = 0; i < f.length; i++) {
            if(f[i] > 0){
                f[i]--;
                lexo(proc + (char)(i + 'a'), f,length-1);
                f[i]++;
            }
        }
    }

    public static void lexoNum(int val, int target){
        if(val > target){
            return;
        }
        for(int i = 0; i < 10; i++){
            if (val == 0 && i == 0){
                continue;
            }
            int v = val * 10 + i;
            if(v <= target){
                System.out.println(v);
                lexoNum(v, target);
            }
        }
    }
}
