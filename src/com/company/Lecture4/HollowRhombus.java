package com.company.Lecture4;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        while ( row <= n){
            int  sp = 1;
            while ( sp <= n-row){
                System.out.print("  ");
                sp++;
            }
            int  col = 1;
            while ( col <= n){
                if( row == 1 || row == n || col == 1 || col == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
