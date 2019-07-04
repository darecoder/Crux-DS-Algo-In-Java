package Assignment_6;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        OddEven(n);
    }
    public static void OddEven(int n){
        if(n == 0){
            return;
        }
        if(n % 2 == 1){
            System.out.println(n);
        }
        OddEven(n-1);
        if(n % 2 == 0){
            System.out.println(n);
        }
    }
}


