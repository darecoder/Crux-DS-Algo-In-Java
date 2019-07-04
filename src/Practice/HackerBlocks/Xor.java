package Practice.HackerBlocks;

import java.util.Scanner;

public class Xor {

    public static boolean[] prime = new boolean[8192];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sieveOfEratosthenes(8191);

        int t = s.nextInt();

        while (t-- > 0){
            int n = s.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = s.nextInt();
            }
            System.out.println(xor(0,nums,0));
        }

    }

    public static int xor(int current, int[] nums, int index){
        if (index == nums.length){
            if (isprime(current)){
                return 1;
            }
            return 0;
        }

        int cnt = 0;
        cnt += xor(current ^ nums[index], nums, index + 1);
        cnt += xor(current, nums, index + 1);
        return cnt;
    }

    public static void sieveOfEratosthenes(int n)
    {
        prime[0] = false;
        prime[1] = false;
        for(int i=2;i<n;i++)
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

    public static boolean isprime(int n){
        return prime[n];
    }
}