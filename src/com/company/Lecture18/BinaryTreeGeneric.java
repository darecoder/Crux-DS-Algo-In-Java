package com.company.Lecture18;

import java.util.Arrays;

public class BinaryTreeGeneric<T extends Comparable<T>> {

    private Node root;

    public void add(T value, char... dirs){
        this.root = add(root,value,dirs, 0);
    }

    private Node add(Node node, T value, char[] dirs, int index) {
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

    public T max(){
        return max(root);
    }

    private T max(Node node) {
        if(node == null){
            return null;
        }

        T max = node.value;

        T left = max(node.left);
        T right = max(node.right);

        if(left != null && max.compareTo(left) < 0) {
            max = left;
        }
        if(right != null && max.compareTo(right) < 0) {
            max = right;
        }

        return max;
    }

    public boolean find(T value){
        return find(this.root,value);
    }

    private boolean find(Node node, T value) {
        if(node == null){
            return false;
        }
        if(node.value.compareTo(value) == 0){
            return true;
        }

        return find(node.left,value) || find(node.right,value);
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

    public BinaryTreeGeneric mirrorNew(){
        BinaryTreeGeneric newTree = new BinaryTreeGeneric();

        newTree.root = mirrorNew(this.root);
        return newTree;
    }

    private Node mirrorNew(Node node) {
        if(node == null){
            return null;
        }
        Node temp = new Node(node.value);

        temp.right = mirrorNew(node.left);
        temp.left = mirrorNew(node.right);

        return temp;
    }

    public void orders(){
        System.out.print("preorder : ");
        preorder(root);
        System.out.println();
        System.out.print("inorder : ");
        inorder(root);
        System.out.println();
        System.out.print("postorder : ");
        postorder(root);
        System.out.println();
    }

    public void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(Node node){
        if(node == null){
            return;
        }

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void postorder(Node node){
        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public int height(){
        return depth(root);
    }

    private int depth(Node node) {
        if(node == null){
            return 0;
        }

        return Math.max(depth(node.left), depth(node.right)) + 1;
    }

    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node node){
        if(node == null){
            return 0;
        }

        int max = depth(node.left) + depth(node.right) + 1;

        int left = diameter(node.left);
        int right = diameter(node.right);

        return Math.max(max,Math.max(left,right));
    }

    public void fromPreIn(T[] pre, T[] in){
        this.root = fromPreInRec(pre,in);
    }

    private Node fromPreInRec(T[] pre, T[] in) {
        if(pre.length == 0){
            return null;
        }

        T val = pre[0];

        int i = getIndex(in,val);

        T[] in_left = Arrays.copyOfRange(in,0,i);
        T[] in_right = Arrays.copyOfRange(in, i+1,in.length);

        T[] pre_left = Arrays.copyOfRange(pre,1,i+1);
        T[] pre_right = Arrays.copyOfRange(pre,i+1,pre.length);

        Node node = new Node(val);
        node.left = fromPreInRec(pre_left,in_left);
        node.right = fromPreInRec(pre_right,in_right);

        return node;
    }

    private int getIndex(T[] in,T val){
        int i;
        for (i = 0; i < in.length; i++) {
            for (i = 0; i < in.length; i++) {
                if(val.compareTo(in[i]) == 0){
                    break;
                }
            }
        }

        return i;
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
        T value;
        Node left;
        Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
