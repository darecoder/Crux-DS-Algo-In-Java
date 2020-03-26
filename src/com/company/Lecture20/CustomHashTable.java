package com.company.Lecture20;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashTable<K, V> {

    private ArrayList<LinkedList<Node>> array;  //using arraylist because working in generic mode

    private static final int DEFAULT_SIZE = 20;

    private Integer size = 0;

    public CustomHashTable(){
        array = new ArrayList<LinkedList<Node>>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            array.add(new LinkedList<Node>());
        }
    }

    public void put(K key, V value){
        int index = Math.abs(key.hashCode() % array.size());

        LinkedList<Node> list = array.get(index);
        for (Node node : list){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        size++;
        list.add(new Node(key,value));

        if((((float)size)/array.size()) > .5){
            rehash();
        }
    }

    private void rehash() {
        ArrayList<LinkedList<Node>> old = array;

        array = new ArrayList<>();
        for (int i = 0; i < old.size() * 2; i++) {
            array.add(new LinkedList<>());
        }
        size = 0;
        for(LinkedList<Node> list : old){
            for(Node node : list){
                put(node.key, node.value);
            }
        }
    }

    public V get(K key){
        int index = Math.abs(key.hashCode() % array.size());

        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if(node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public V remove(K key){
        int index = Math.abs(key.hashCode() % array.size());

        LinkedList<Node> list = array.get(index);

        Node target = null;
        for (Node node : list){
            if(node.key.equals(key)){
                target = node;
                break;
            }
        }

        if(target == null){
            return null;
        }

        list.remove(target);
        size--;
        return target.value;
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
