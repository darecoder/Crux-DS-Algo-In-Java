package com.company.Lecture20;

import java.util.ArrayList;

public class TableUsingArray <K, V> {

    private ArrayList<Node> array;  //using arraylist because working in generic mode

    private static final int DEFAULT_SIZE = 20;

    public TableUsingArray(){
        array = new ArrayList<Node>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            array.add(null);
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode() % array.size());

        array.set(index, new Node(key, value));
    }

    public V get(K key){
        int index = Math.abs(key.hashCode() % array.size());

        Node node = array.get(index);

        if(node == null || !node.key.equals(key)){
            return null;
        }

        return node.value;
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode() % array.size());

        Node node = array.get(index);

        if(node == null || !node.key.equals(key)){
            return null;
        }

        array.set(index, null);
        return node.value;
    }

    private class Node{
        K key;
        V value;


        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
