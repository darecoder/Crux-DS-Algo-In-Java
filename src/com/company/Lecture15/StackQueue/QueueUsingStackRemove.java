package com.company.Lecture15.StackQueue;

import jdk.nashorn.internal.ir.IdentNode;

import java.util.Stack;

public class QueueUsingStackRemove {
    private Stack<Integer> stack = new Stack<Integer>();

    public int dequeue(){
        return stack.pop();
    }

    public void add(int item){
        if(stack.isEmpty()){
            stack.push(item);
        }else{
            Stack<Integer> temp = new Stack<Integer>();
            while(!stack.isEmpty()){
                temp.push(stack.pop());
            }
            stack.push(item);
            while (!temp.isEmpty()){
                stack.push(temp.pop());
            }
        }
    }

    public boolean isEmpty(){
        return stack.empty();
    }

    public Integer front(){
        return stack.peek();
    }
}
