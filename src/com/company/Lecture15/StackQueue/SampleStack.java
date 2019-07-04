package com.company.Lecture15.StackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SampleStack {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(12);
        queue.add(65);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        stack1.push(72);
        stack1.push(61);

    }

//    public static void enque(int item){
//
//    }

//    public static int deque(sta){
//        while(!stack1.empty()){
//            stack2.push(stack1.pop());
//        }
//
//        System.out.println(stack2.pop());
//
//        while(!stack2.empty()){
//            stack1.push(stack2.pop());
//        }
//    }
}
