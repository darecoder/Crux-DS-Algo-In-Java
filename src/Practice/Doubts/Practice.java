package Practice.Doubts;

import java.util.Scanner;

class LinkedList {

    private Node head;

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void insertLast(int value){
        if(head == null){
            Node node = new Node(value, head);
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next !=  null){
            temp = temp.next;
        }
        temp.next = new Node(value);
    }

    public static int findIntersection(int n1, LinkedList list1, int n2 , LinkedList list2){
        return 0;
    }
}

public class Practice{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        LinkedList list1 = new LinkedList();
        for (int i = 0; i < n1; i++) {
            list1.insertLast(s.nextInt());
        }
        int n2 = s.nextInt();
        LinkedList list2 = new LinkedList();
        for (int i = 0; i < n2; i++) {
            list2.insertLast(s.nextInt());
        }

        System.out.println();
    }
}


