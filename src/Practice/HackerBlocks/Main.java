package Practice.HackerBlocks;

import java.util.Scanner;

public class Main {

    public static boolean[] prime = new boolean[8192];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M = 1000000007;
        int t = s.nextInt();

        sieveOfEratosthenes(8191);

//        System.out.println(prime[7] + " " + prime[8]);

        while (t-- > 0){
            int n = s.nextInt();
            int[] cnt = new int[8192];
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = s.nextInt();
                cnt[nums[i] - 3500]++;
            }

            int[][] mem = new int[1002][8192];

            mem[0][0] = cnt[0]/2 + 1;     //line 1
            mem[0][3500] = (cnt[0] + 1)/2; // line 2

            for (int i = 1; i < 1002; i++) {
                for (int j = 0; j < 8192; j++) {
                    // Yahan kya aayega ;)
                    mem[i][j] = (mem[i-1][j]*((cnt[i]+2)/2) + mem[i-1][j^(i+3500)]*((cnt[i]+1)/2) ) % M ;  // line 3
                }
            }

            // line 1, 2, 3 ka reference geeksforgeeks se lia hai
            int sum = 0;
            for (int i = 0; i < 8192; i++) {
                sum += mem[1001][i];
            }

            System.out.println(sum/2);
        }

    }

    public static void sieveOfEratosthenes(int n)
    {
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }
}