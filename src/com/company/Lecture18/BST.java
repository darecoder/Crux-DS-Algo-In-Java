package com.company.Lecture18;

import com.company.Lecture17.LinkedListGeneric;

public class BST <T extends Comparable<T>> {

    private Node root;

    private class Node{
        T value;
        Node left;
        Node right;
        int height;

        public Node(T value){
            this.value = value;
            this.height = 1;
        }
    }

    public void add(T value){
        this.root = add(root, value);
    }

    private Node add(Node node, T value) {
        if(node == null){
            return new Node(value);
        }

        if(value.compareTo(node.value) < 0){
            node.left = add(node.left,value);
        }else{
            node.right = add(node.right,value);
        }

        node.height = Math.max(height(node.right),height(node.left)) + 1;

        node = balancing(node);

        return node;
    }

    public T max(){
        return max(root);
    }

    private T max(Node node) {
        if(node.right == null){
            return node.value;
        }

        return max(node.right);
    }

    private int height(Node node){
        if(node == null){
            return 0;
        }

        return node.height;
    }

    public int heightOfTree(){
        return height(root);
    }

    public T min(){
        return min(root);
    }

    private T min(Node node) {
        if(node.left == null){
            return node.value;
        }

        return min(node.left);
    }

    public void range(T start, T end){
        range(start,end,root);
    }

    private void range(T start, T end, Node node) {
        if(node == null){
            return;
        }
        if(node.value.compareTo(start) > 0) {
            range(start, end, node.left);
        }
        if(node.value.compareTo(start) >= 0 && node.value.compareTo(end) <= 0) {
            System.out.print(node.value + " ");
        }
        if(node.value.compareTo(end) < 0) {
            range(start, end, node.right);
        }
    }

    public void display(){
        display(root, "","root");
    }

    private void display(Node node, String indent, String type) {
        if(node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type);
        display(node.left,indent + "\t", "left");
        display(node.right,indent + "\t", "right");
    }

    public void populateFromSorted(T[] sorted){
        this.root = populateFromSorted(sorted,0,sorted.length-1);
    }

    private Node populateFromSorted(T[] sorted,int start, int end){
        if(end < start){
            return null;
        }
        int mid = (start+end)/2;

        Node node = new Node(sorted[mid]);

        node.left = populateFromSorted(sorted,start,mid - 1);
        node.right = populateFromSorted(sorted,mid + 1,end);

        return node;
    }

    public void rightRotate(){
        this.root = rightRotate(this.root);
    }

    private Node rightRotate(Node x){
        Node y= x.left;
        Node t2 = y.right;

        y.right = x;
        x.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left),height(x.right)) + 1;

        return y;

        //      x
        //     /
        //   y
        //    \
        //     t2
    }

    public void leftRotate(){
        this.root = leftRotate(this.root);
    }

    private Node leftRotate(Node x){
        Node y= x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left),height(x.right)) + 1;

        return y;

        //   x
        //    \
        //     y
        //    /
        //  t2
    }

    private Node balancing(Node node){

        if((height(node.left) - height(node.right)) > 1){
            if((height(node.left.left) - height(node.left.right)) < 0){
                node.left = leftRotate(node.left);
            }

            node = rightRotate(node);
        }

        if((height(node.left) - height(node.right)) < -1){
            if((height(node.right.left) - height(node.right.right)) > 0){
                node.right = rightRotate(node.right);
            }

            node = leftRotate(node);
        }

        return node;
    }

    public T nodeSuccessor(T item){
        return nodeSuccessor(this.root,item);
    }

    private T nodeSuccessor(Node node, T item){
        Node index = search(this.root, item);

        if(index.right != null){
            Node res = index.right;
            Node temp = res;
            while(temp.left != null){
                temp = temp.left;
            }

            return temp.value;
        }

        return null;
    }

    private Node search(Node node, T item){
        if(node.value.compareTo(item) == 0){
            return node;
        }else if(node.value.compareTo(item) < 0){
            return search(node.right,item);
        }else if(node.value.compareTo(item) > 0){
            return search(node.left,item);
        }

        return null;
    }

    public LinkedListGeneric<T> makeSortedList(){
        LinkedListGeneric<T> list = new LinkedListGeneric<T>();
        return makeSortedList(this.root,list);
    }

    private LinkedListGeneric<T> makeSortedList(Node node, LinkedListGeneric list) {
        if(node == null){
            return list;
        }

        makeSortedList(node.left,list);
        list.insertLast(node.value);
        makeSortedList(node.right,list);

        return list;
    }

}
