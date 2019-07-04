package com.company.Lecture16.QueueStack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueuePush {
    private Queue<Integer> queue = new LinkedList<Integer>();

    public void push(int item){
        queue.add(item);
    }

    public Integer pop(){
        Queue temp = new LinkedList<Integer>();
        Integer t;
        while(true){
            t = queue.remove();
            if(queue.isEmpty()){
                break;
            }
            temp.add(t);
        }

        queue = temp;
        return t;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public Integer peek(){
        return queue.peek();
    }

}
