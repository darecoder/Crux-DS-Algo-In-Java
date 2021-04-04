package com.company.Lecture17;

public class LinkedListGeneric <T extends Comparable<T>> { //Comparable interface should be implemented by T
                                                            //Else it will not work for compareTo function
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(T value){
        head = new Node(value, head);

        if(size == 0){
            tail = head;
        }

        size++;
    }

    public void insertLast(T value){
        if(size == 0){
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public T deleteFirst(){
        if(size == 0){
            return null;
        }
        T temp = head.value;
        head = head.next;
        size--;

        if(size == 0){
            tail = null;
        }

        return temp;
    }

    public T deleteLast(){
        if(size < 2){
            return deleteFirst();
        }

        Node prev = get(size - 2);
        T value = tail.value;
        prev.next = null;
        tail = prev;

        size--;

        return value;
    }

    public void insert(int index, T value){
        if(index == 0){
            insertFirst(value);
            return;
        }else if(index == size){
            insertLast(value);
            return;
        }

        Node prev = get(index - 1);
        Node node = new Node(value,prev.next);
        prev.next = node;

        size++;
    }

    public T delete(int index){
        if(index == 0){
            return deleteFirst();
        }else if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        T value = prev.next.value;
        prev.next = prev.next.next;

        size--;

        return value;
    }
    
    public LinkedListGeneric<T> merge(LinkedListGeneric<T> first, LinkedListGeneric<T> second){
         Node h1 = first.head;
         Node h2 = second.head;

         LinkedListGeneric<T> list = new LinkedListGeneric<>();

         while(h1 != null && h2 != null){
             if(h1.value.compareTo(h2.value) < 0){
                 list.insertLast(h1.value);
                 h1 = h1.next;
             }else{
                 list.insertLast(h2.value);
                 h2 = h2.next;
             }
         }

        while (h1 != null){
            list.insertLast(h1.value);
            h1 = h1.next;
        }

        while (h2 != null){
            list.insertLast(h2.value);
            h2 = h2.next;
        }

        return list;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }

        return node;
    }
    
    public void display(){
        Node node = head;

        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

}
