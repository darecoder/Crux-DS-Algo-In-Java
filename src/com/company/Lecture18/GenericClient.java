package com.company.Lecture18;

public class GenericClient {
    public static void main(String[] args) {
        BinaryTreeGeneric<Integer> tree = new BinaryTreeGeneric<Integer>();

        tree.add(10);
        tree.add(5,'l');
        tree.add(6,'r');
        tree.add(9,'r','r');
        tree.add(7,'l','r');
        tree.add(3,'l','l');

        tree.display();

        BinaryTreeGeneric<Integer> t = new BinaryTreeGeneric<Integer>();
        Integer[] pre = {10,5,3,7,6,9};
        Integer[] in = {3,5,7,10,6,9};

        t.fromPreIn(pre,in);

        t.display();
    }
}
