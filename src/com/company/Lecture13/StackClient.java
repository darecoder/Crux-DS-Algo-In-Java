package com.company.Lecture13;

import com.company.Lecture15.Stack;

public class StackClient {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(65);
        s.push(58);
        s.push(37);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
