package com.company.Lecture14;

public class DynamicCircularQueue extends CircularQueue{
    @Override
    public void enqueue(int item) {
        if(isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i + this.front) % data.length];
            }
            this.data = temp;
        }

        super.enqueue(item);
    }
}
