package com.company.Lecture19.Greedy;

import java.util.Arrays;

public class KnapSack{
    public static void main(String[] args) {
        double[] price = {5,10,15,5,10};
        double[] weight = {1, 2, 3, 4, 1};
        double cap = 5;
        Item[] items = new Item[price.length];
        for (int i = 0; i < price.length; i++) {
            items[i] = new Item(price[i], weight[i]);
        }

        Arrays.sort(items);
        System.out.println(Arrays.toString(items));

        double reward = 0;

        for (int i = 0; i < items.length && cap > 0; i++) {
            if(cap > items[i].weight){
                cap -= items[i].weight;
                reward += items[i].price;
            }else{
                reward += cap * items[i].density;
                cap = 0;
            }
        }

        System.out.println(reward);
    }
    public static class Item implements Comparable<Item>{
        public double weight;
        public double price;
        public double density;

        public Item(double price, double weight) {
            this.price = price;
            this.weight = weight;
            this.density = price/weight;
        }


        @Override
        public int compareTo(Item other) {
            if(other.density > this.density){
                return 1;
            }else if(other.density < this.density){
                return -1;
            }else{
                return 0;
            }
        }

        @Override
        public String toString() {
            return String.format("{%.2f, %.2f, %.2f}",price,weight,density);
        }
    }
}
