package Assignment_6;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        star(n,0);

    }
    public static void star(int row, int col){
        if( row == 0) {
            System.out.print("*");
            return;
        }
        if(row == col-1 ){
            star(row-1 , 0);
            System.out.println();
            return;
        }
        star(row , col + 1);
        System.out.print("*");
    }
}
