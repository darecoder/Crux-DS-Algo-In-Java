package com.company.Lecture19;

import java.util.PriorityQueue;

public class PQClient {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(3);
        queue.add(4);
        queue.add(1);
        queue.add(2);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.add(1);
        queue.add(2);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
