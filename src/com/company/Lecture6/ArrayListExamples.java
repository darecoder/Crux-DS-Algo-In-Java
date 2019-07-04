package com.company.Lecture6;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(6);

        System.out.println(list);

        list.set(1, 5);

        System.out.println(list);

        System.out.println(list.get(0));

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

}
