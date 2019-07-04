package com.company.Lecture16.QueueStack;

import com.company.Lecture13.Queue;

public class StackUsingQueuePop {

    private Queue queue = new Queue();

    public Integer pop(){
        return queue.dequeue();
    }

    public void push(int item){
        Queue temp = new Queue();
        temp.enqueue(item);
        while(!queue.isEmpty()){
            temp.enqueue(queue.dequeue());
        }
        queue = temp;
    }

    public Integer peek(){
        return queue.end;
    }

}
