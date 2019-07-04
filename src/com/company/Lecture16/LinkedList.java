package com.company.Lecture16;

public class LinkedList {

    private Node head;

    private class Node{
        String value;
        Node next;

        public Node(String value){
            this.value = value;
        }

        public Node(String value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(String value){
        // New node point to old head
        Node node = new Node(value, head);

        // now new node is new head
        head = node;
    }

    public void insertLast(String value){
        if(head == null){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while (temp.next !=  null){
            temp = temp.next;
        }
        temp.next = new Node(value);
    }

    public String deleteFirst(){
        if(head == null){
            return null;
        }
        String temp = head.value;
        head = head.next;
        return temp;
    }

    public String deleteLast(){
        if(head == null || head.next == null){
            return deleteFirst();
        }

        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }

        String temp = node.next.value;
        node.next = null;
        return temp;
    }

    public void insert(int index, String value){
        if(index == 0){
            insertFirst(value);
            return;
        }

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        Node node = new Node(value, prev.next);
        prev.next = node;
    }

    public String delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        String value = prev.next.value;
        prev.next = prev.next.next;
        return value;
    }

    public String findMid(){
        Node node = head;
        Node temp = head;
        while(temp.next != null && temp.next.next != null){
            node = node.next;
            temp = temp.next.next;
        }

        String mid = node.value;
        return mid;
    }

    public void reverseList(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr !=  null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public LinkedList copy(){
        LinkedList list = new LinkedList();
        list.head = this.head;

        return list;
    }

    public static LinkedList merge(LinkedList first,LinkedList second){
        Node h1 = first.head;
        Node h2 = second.head;

        LinkedList list = new LinkedList();
        while (h1 != null && h2 != null){
            if(h1.value.compareTo(h2.value) < 0){
                // shift from h1
                list.insertLast(h1.value);
                h1 = h1.next;

            }else{
                // shift from h2
                list.insertLast(h2.value);
                h2 = h2.next;
            }
        }

        while (h1 != null){
            // shift from h1
            list.insertLast(h1.value);
            h1 = h1.next;
        }

        while (h2 != null){
            // shift from h2
            list.insertLast(h2.value);
            h2 = h2.next;
        }
        return list;
    }

    public void display(){
        Node node = head;

        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
}
