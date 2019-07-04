package Practice.HackerBlocks;

import java.util.Scanner;

public class PainterProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(countPainter(nums, k));
    }

    public static int countPainter(int[] nums, int k) {
        int lo = getmax(nums);
        int hi = getsum(nums);

        while (lo < hi){
            int mid = lo + (hi - lo)/2;
            int cnt = getPainter(nums, mid);
            if(cnt <= k){
                hi = mid;
            }else {
                lo = mid+1;
            }
        }

        return lo;
    }

    public static int getPainter(int[] nums, int target) {
        int sum = 0, cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > target){
                cnt++;
                sum = nums[i];
            }
        }
        return cnt;
    }

    public static int getsum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int getmax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
