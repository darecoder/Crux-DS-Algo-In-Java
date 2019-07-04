package com.company.Lecture18;

public class BSTClient {
    public static void main(String[] args) {
        BST tree = new BST();

//        for (int i = 0; i < 10; i++) {
//            tree.add((int)(Math.random() * 10));
//        }

        tree.add(14);
        tree.add(20);
        tree.add(8);
        tree.add(10);
        tree.add(15);
        tree.add(6);
        tree.add(22);
//        System.out.println(tree.heightOfTree());

//        tree.display();
//
//        System.out.println(tree.max());
//        System.out.println(tree.min());

//        tree.range(4,15);
        Integer[] nums = {1,2,3,4,5};
        BST<Integer> t = new BST<Integer>();
        t.populateFromSorted(nums);

        t.display();
    }
}
