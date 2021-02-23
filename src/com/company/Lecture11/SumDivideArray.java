package com.company.Lecture11;

import com.company.Lecture5.ArrayIntro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SumDivideArray {
    public static void main(String[] args) {
        int[] nums ={-1,3,7,4,2,1};
        divide(nums, 0,0,0,new ArrayList<>(),new ArrayList<>());
//        sumTarget(nums,0,10,0,new ArrayList<>());
    }

    public static void divide(int[] nums,int index, int sum1, int sum2, ArrayList<Integer> list1,ArrayList<Integer> list2){
        if( index == nums.length){
            if(sum1 == sum2){
                System.out.println(list1 + " : " + list2);
            }
            return;
        }

        int value = nums[index];

        list1.add(value);
        divide(nums,index+1,sum1 + value,sum2,list1,list2);
        list1.remove(list1.size() -1);

        list2.add(value);
        divide(nums,index+1,sum1,sum2 + value,list1,list2);
        list2.remove(list2.size() - 1);

    }

    public static void sumTarget(int[] nums, int index, int target, int sum, ArrayList<Integer> list){
        if(index == nums.length){
            if(sum == target && list.size() == 3){
                System.out.println(list);
            }
            return;
        }

        list.add(nums[index]);
        sumTarget(nums,index+1,target,sum + nums[index],list);
        list.remove(list.size() - 1);

        sumTarget(nums, index+1,target,sum,list);
    }
}
