package Assignment_6;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        star(n,0);

    }

    public static void star(int row, int col){
        if( row == 0) {
            return;
        }
        if(row == col ){
            System.out.println();
            star(row-1 , 0);
            return;
        }
        System.out.print("*");
        star(row , col + 1);
    }
}
