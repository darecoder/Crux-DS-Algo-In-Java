package com.company.Lecture19;

public class HeapClient {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();

        heap.add(4);
        heap.add(8);
        heap.add(1);
        heap.add(9);

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap);
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap);
    }
}
