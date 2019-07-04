package com.company.Lecture17;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public void add(String value, char... dirs){
        this.root = add(root,value,dirs, 0);
    }

    private Node add(Node node, String value, char[] dirs, int index) {
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(dirs[index] == 'l'){
            node.left = add(node.left, value, dirs,index+1);
        }else{
            node.right = add(node.right, value, dirs, index + 1);
        }

        return node;
    }

    public String max(){
        return max(root);
    }

    private String max(Node node) {
        if(node == null){
            return null;
        }

        String max = node.value;

        String left = max(node.left);
        String right = max(node.right);

        if(left != null && max.compareTo(left) < 0) {
            max = left;
        }
        if(right != null && max.compareTo(right) < 0) {
            max = right;
        }

        return max;
    }

    public boolean find(String value){
        return find(this.root,value);
    }

    private boolean find(Node node, String value) {
        if(node == null){
            return false;
        }
        if(node.value.compareTo(value) == 0){
            return true;
        }

        if(find(node.left,value)){
            return true;
        }

        if(find(node.right,value)){
            return true;
        }

        return false;
    }

    public void mirror(){
        mirror(root);
    }

    private void mirror(Node node) {
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        if(node.left != null){
            mirror(node.left);
        }
        if(node.right != null) {
            mirror(node.right);
        }
    }

    public BinaryTree mirrorNew(){
        BinaryTree newTree = new BinaryTree();
        newTree.root = this.root;
        return mirrorNew(this.root,newTree);
    }

    private BinaryTree mirrorNew(Node node, BinaryTree newTree) {
        newTree.add(node.left.value,'r');
        newTree.add(node.right.value,'l');
        mirrorNew(node.left,newTree);
        mirrorNew(node.right,newTree);

        return newTree;
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

    private class Node{
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }


}
