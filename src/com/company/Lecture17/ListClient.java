package com.company.Lecture17;

public class ListClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst("Mohita");
        list.insertFirst("Mohan");
        list.insertLast("Ravi");
        list.display();

//        list.deleteFirst();

//        list.insert(1,"Priyanka");
//        list.insert(2,"Gagan");
//
//        list.display();
//
//        list.delete(1);

        list.display();

        LinkedListGeneric<Integer> num = new LinkedListGeneric<Integer>();

        num.insertLast(1);
        num.insert(0,5);

        num.display();
    }
}
