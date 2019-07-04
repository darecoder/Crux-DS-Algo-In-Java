package Practice.HackerBlocks;

import java.util.Scanner;

public class Target3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        pattern(n,0);
    }
    public static void pattern(int row, int col){
        if(row == 0){
            return;
        }
        if(row == col){
            pattern(row-1,0);
            if(row != 1) {
                System.out.println();
            }
            return;
        }
        pattern(row, col+1);
        System.out.print("*\t");
    }
}
