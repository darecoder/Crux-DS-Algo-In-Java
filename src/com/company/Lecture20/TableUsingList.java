package com.company.Lecture20;

import java.util.LinkedList;

public class TableUsingList <K, V> {

    private LinkedList<Node> list = new LinkedList<Node>();

    public void put(K key, V value){
        for (Node node : list){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        list.add(new Node(key,value));
    }

    public V get(K key){
        for (Node node : list){
            if(node.key.equals(key)){
                return node.value;
            }
        }

        return null;
    }

    public V remove(K key){
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
