package com.company.Lecture16;

public class Client {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.display();

        list.insertFirst("Mohini");
        list.insertLast("Suyash");
        list.insertLast("Preksha");
        list.display();

//        list.deleteFirst();
//        list.display();
//
//        list.deleteLast();
//        list.display();
//
//        list.insert(1,"Preksha");
//        list.display();
//
//        list.delete(1);
//        list.display();
//        System.out.println(list.findMid());
//        list.reverseList();
//        list.display();
        LinkedList first = new LinkedList();
        LinkedList second;

        first.insertLast("Mona");
        first.insertLast("Sona");
        second = first.copy();

        second.insertLast("rona");

        first.display();
        second.display();
    }
}
