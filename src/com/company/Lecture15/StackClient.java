package com.company.Lecture15;

import com.company.Lecture13.DynamicStack;

public class StackClient {
    public static void main(String[] args) {

        Stack s = new DynamicStack();

        for (int i = 0; i < 100 ; i++) {
            s.push(i);
        }

        System.out.println(s.pop());
    }
}
