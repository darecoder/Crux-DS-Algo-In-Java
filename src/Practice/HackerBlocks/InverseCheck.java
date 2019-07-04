package Practice.HackerBlocks;

import java.util.Scanner;

public class InverseCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[n];

        for (int i = 0; i < n; i++) {
            num1[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num2[i] = s.nextInt();
        }

        System.out.println(inverseCheck(num1,num2));
    }

    public static boolean inverseCheck(int[] num1, int[] num2){
        for (int i = 0; i < num1.length; i++) {
            if(num2[num1[i]] != i){
                return false;
            }
        }
        return true;
    }
}
