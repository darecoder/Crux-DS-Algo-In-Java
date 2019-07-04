package com.company.Lecture16.QueueStack;

import com.company.Lecture14.CircularQueue;
import com.company.Lecture14.DynamicCircularQueue;
import com.company.Lecture15.StackQueue.QueueUsingStackRemove;
import com.company.Lecture16.QueueStack.StackUsingQueuePop;
import com.company.Lecture16.QueueStack.StackUsingQueuePush;

public class Client {
    public static void main(String[] args) {
        QueueUsingStackRemove q = new QueueUsingStackRemove();

        q.add(2);
        q.add(6);

        System.out.println(q.front());

        StackUsingQueuePush s1 = new StackUsingQueuePush();

        s1.push(7);
        s1.push(5);
        s1.push(6);

        System.out.println(s1.pop());

        StackUsingQueuePop s2 = new StackUsingQueuePop();

        s2.push(5);
        s2.push(8);
        s2.push(1);

        System.out.println(s2.pop());

        CircularQueue c = new DynamicCircularQueue();

        for (int i = 0; i < 10; i++) {
            c.enqueue(i);
        }

        c.dequeue();
        c.dequeue();

        for (int i = 0; i < 5; i++) {
            c.enqueue(i);
        }

        System.out.println(c.dequeue());
        System.out.println();
    }
}
