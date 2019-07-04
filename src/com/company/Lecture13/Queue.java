package com.company.Lecture13;

import com.company.Lecture5.ArrayIntro;

public class Queue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    public int end;

    public Queue(){
//        data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public Queue(int size){
        data = new int[size];
        end = -1;
    }

    public boolean isFull(){
        return this.end == data.length-1;
    }

    public boolean isEmpty(){
        return this.end == -1;
    }

    public void enqueue(int item){
        if(!isFull()){
            data[++end] = item;
            return;
        }
        System.out.println("Queue is overflow!!");
    }

    public Integer dequeue(){
        if(isEmpty()){
            return null;
        }
        int temp = data[0];
        for (int i = 0; i < end ; i++) {
            data[i] = data[i+1];
        }
        end--;
        return temp;
    }

    public void display(){
        for (int i = 0; i < end ; i++) {
            System.out.print(this.data[i] + ", ");
        }
        System.out.println(this.data[end]);
    }

    public int peek(){
        return end;
    }
}
