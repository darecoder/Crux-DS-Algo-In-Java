package com.company.Lecture20;

import java.util.*;

public class Questions {
    public static void main(String[] args) {
//        Q1("Ekta Mishra");
        Integer arr1[] = {1,2,3,4,5};
        Integer arr2[] = {3,3,3,3,3,3,2,9,1};
        Q2(arr1,arr2);
        Q3(arr1,arr2);
    }
    public static void Q1(String line) {
        // print occ count for each other

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if(map.get(ch) != null){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }

    public static void Q2(Integer arr1[], Integer arr2[]){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        List<Integer> list = new ArrayList<Integer>(0);
        for (int i = 0; i < arr1.length; i++) {
            if(map.get(arr1[i]) != null){
                map.put(arr1[i],map.get(arr1[i]) + 1);
            }else{
                map.put(arr1[i],1);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(map.get(arr2[i]) != null && map.get(arr2[i]) > 0){
                map.put(arr2[i],map.get(arr2[i]) - 1);
                list.add(arr2[i]);
            }
        }

        Collections.sort(list);
        System.out.println(list);
    }

    public static void Q3(Integer arr1[], Integer arr2[]){
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> inter = new HashSet<Integer>();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int item : arr1){
            set.add(item);
        }

        for(int item : arr2){
            if(set.contains(item)){
                inter.add(item);
            }
        }

        for(int item : inter){
            list.add(item);
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
