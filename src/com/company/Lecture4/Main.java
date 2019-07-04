package com.company.Lecture4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n = 4;
        int r = 0;

        while(r < n){
            int c = 0;
            while(c < n - r){
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
    }
}