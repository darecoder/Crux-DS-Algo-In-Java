package com.company.Lecture19;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<T>();

    private int left(int index){
        return index*2 + 1;
    }

    private int right(int index){
        return index*2 + 2;
    }

    private int parent(int index){
        return (index - 1)/2;
    }

    public void add(T value){
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index){
        if(index == 0){
            return;
        }
        int parent = parent(index);
        if(list.get(parent).compareTo(list.get(index)) <= 0){
            return;
        }
        T temp = list.get(index);
        list.set(index,list.get(parent));
        list.set(parent,temp);
        upHeap(parent);
    }

    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(left).compareTo(list.get(min)) < 0){
            min = left;
        }
        if(right < list.size() && list.get(right).compareTo(list.get(min)) < 0 ){
            min = right;
        }
        if(min != index){
            T temp = list.get(index);
            list.set(index,list.get(min));
            list.set(min,temp);
            downHeap(min);
        }
    }

    public T remove(){
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return list.remove(0);
        }
        T value = list.get(0);
        list.set(0,list.remove(list.size()-1));
        downHeap(0);
        return value;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
