package com.company.Lecture20;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomHashSet<K> {

    private ArrayList<LinkedList<Node>> array;  //using arraylist because working in generic mode

    private static final int DEFAULT_SIZE = 20;

    private Integer size = 0;

    public CustomHashSet(){
        array = new ArrayList<LinkedList<Node>>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            array.add(new LinkedList<Node>());
        }
    }

    public void add(K key){
        int index = Math.abs(key.hashCode() % array.size());
        LinkedList<Node> list = array.get(index);
        for (Node node : list){
            if(node.key.equals(key)){
                return;
            }
        }
        size++;
        list.add(new Node(key));
        if((((float)size)/array.size()) > .5){
            rehash();
        }
    }

    private void rehash() {
        ArrayList<LinkedList<Node>> old = array;

        array = new ArrayList<LinkedList<Node>>();
        for (int i = 0; i < old.size() * 2; i++) {
            array.add(new LinkedList<Node>());
        }
        size = 0;
        for(LinkedList<Node> list : old){
            for(Node node : list){
                add(node.key);
            }
        }
    }

    public boolean contains(K key){
        int index = Math.abs(key.hashCode() % array.size());

        LinkedList<Node> list = array.get(index);

        for (Node node : list){
            if(node.key.equals(key)){
                return true;
            }
        }

        return false;
    }

    public boolean remove(K key){
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
            return false;
        }
        list.remove(target);
        size--;
        return true;
    }

    private class Node{
        K key;

        public Node(K key) {
            this.key = key;
        }
    }
}
