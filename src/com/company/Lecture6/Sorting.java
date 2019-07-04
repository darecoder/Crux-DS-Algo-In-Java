package com.company.Lecture6;

import com.company.Lecture5.ArrayIntro;

public class Sorting {

    public static void main(String[] args) {
        int[] nums ={32, 76,12,98,29,20,56};
        insertion(nums);

        ArrayIntro.display(nums);
    }

    public static void insertion ( int[] nums){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j >=1 ; j--) {
                if ( nums[j] < nums[j-1]) {
                    ArrayIntro.swap(nums, j, j - 1);
                }else {
                    break;
                }
            }
        }
    }

}
