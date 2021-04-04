package com.company.Lecture14;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front;
    protected int end;
    private int size;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
        this.front = 0;
        this.end = -1;
        this.size = 0;
    }

//    public boolean isFull(){
//        return ((front == 0 && end == data.length-1) || (front == end + 1));
//    }
//
//    public boolean isEmpty(){
//        return (front == end);
//    }

    public boolean isFull(){
        return this.size == this.data.length;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void enqueue(int item){
        if(!isFull()){
            this.end = (this.end + 1) % data.length;
            data[end] = item;
            size++;
            return;
        }
        System.out.println("Queue overflow!!");
    }

    public Integer dequeue(){
        if(!isEmpty()){
            int temp = this.data[front];
            this.front = (this.front + 1) % data.length;
            size--;
            return temp;
        }
        return null;
    }

    public void display(){
        for (int i = 0; i < size - 1; i++) {
            System.out.print(data[(front + i) % data.length ] + ", ");
        }
        System.out.println(data[end]);
    }

}
