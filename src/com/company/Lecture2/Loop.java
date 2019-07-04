package com.company.Lecture2;

public class Loop {
    public static void main(String[] args) {
        int n = 4;
        int row =0;

        while (row < n) {
            int col = 0;
            while( col < n){
                System.out.print("* ");
                col++;
            }
            System.out.println();

            row++;
        }

    }
}
