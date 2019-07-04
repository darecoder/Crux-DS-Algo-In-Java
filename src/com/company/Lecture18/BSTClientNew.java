package com.company.Lecture18;

import com.company.Lecture17.LinkedList;
import com.company.Lecture17.LinkedListGeneric;

public class BSTClientNew {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<Integer>();
        tree.add(14);
        tree.add(20);
        tree.add(8);
        tree.add(10);
        tree.add(15);
        tree.add(6);
        tree.add(22);

        tree.display();

        System.out.println("Successor of 14 : " + tree.nodeSuccessor(14));

        LinkedListGeneric<Integer> list = tree.makeSortedList();

        System.out.print("Sorted Linked List : ");
        list.display();

//        for (int i = 0; i < 10000; i++) {     // after balancing
//            tree.add(i);
//        }
//
//        System.out.println(tree.heightOfTree());

//        tree.add(5);
//        tree.add(10);
//        tree.add(15);
//
//        tree.display();
//
//        tree.leftRotate();
//
//        tree.display();
    }
}
