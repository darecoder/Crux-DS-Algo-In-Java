package com.company.Lecture20;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
//        CustomHashTable<String, String> dict = new CustomHashTable<String, String>();
//
//        dict.put("apple","a sweet red fruit");
//        dict.put("mango","king of fruits");
        String s1 ="apple";
        String s2 = "mango";
        System.out.println(s1.hashCode() + " " + s2.hashCode());
//        System.out.println(dict.get("apple"));
//
//        dict.put("apple","a sour red fruit");
//
//        System.out.println(dict.get("apple"));
//
//        dict.remove("apple");
//
//        System.out.println(dict.get("apple"));
//        System.out.println(dict.get("lichi"));

//        System.out.println(dict.hashCode());

        CustomHashTable<Integer, Integer> dict = new CustomHashTable<Integer, Integer>();

        for (int i = 0; i < 10000; i++) {
            dict.put(i,i);
        }
    }
}
