package codechef.JuneChallenge;

import java.util.Scanner;

public class he2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while (t-- > 0){
            int[] nums = new int[4];
            for (int i = 0; i < 4; i++) {
                nums[i] = s.nextInt();
            }

            if(nums[1] == nums[2]){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    }
}
