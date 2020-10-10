package com.company.Lecture13;

import java.util.Stack;

public class CheckParanthesis {
    public static void main(String[] args) {
        String str = "{(){}[((])]}";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) =='(') {
                stack.push(str.charAt(i));
            }else {
                char close = findOpen(str.charAt(i));
                if (stack.peek() == close) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.empty()) {
            return true;
        }
        return false;
    }

    private static char findOpen(char ch) {
        if (ch == ')') {
            return  '(';
        }else if(ch == '}') {
            return '{';
        } else {
            return '[';
        }
    }
}
