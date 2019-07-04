package Practice.HackerBlocks;

import java.util.Scanner;

public class LexoNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        lexoNum(0,n);
    }

    public static void lexoNum(int val, int target){
        if(val > target){
            return;
        }
        for(int i = 0; i < 10; i++){
            if (val == 0 && i == 0){
                System.out.print("0 ");
                continue;
            }
            int v = val * 10 + i;
            if(v <= target){
                System.out.print(v + " ");
                lexoNum(v, target);
            }
        }
    }
}
