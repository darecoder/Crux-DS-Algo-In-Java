package com.company.Lecture13;

import com.company.Lecture14.CircularQueue;

public class QueueClient {
    public static void main(String[] args) {
//        Queue q = new Queue();
//
//        q.enqueue(2);
//        q.enqueue(8);
//        q.enqueue(3);
//        q.enqueue(7);
//
//        q.display();
//
//        q.dequeue();
//        q.dequeue();
//
//        q.display();

        CircularQueue c = new CircularQueue(3);

        c.enqueue(4);
        c.enqueue(6);
        c.enqueue(7);

        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());


        c.enqueue(8);
        c.enqueue(4);
        c.enqueue(9);
        c.enqueue(2);
        c.display();
    }
}
