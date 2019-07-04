package Practice.HackerBlocks;

import java.util.Scanner;

public class Kadane2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int row = s.nextInt();
            int col = s.nextInt();
            int[][] nums = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    nums[i][j] = s.nextInt();
                }
            }

            System.out.println(maxSum(nums,row,col));
        }
    }

    public static int maxSum(int[][] nums,int row,int col){
        int sum = Integer.MIN_VALUE,max = Integer.MIN_VALUE,cur_sum;

        int[] temp = new int[row];

        for (int i = 0; i < col; i++) {
            for (int j = i; j < col; j++) {
                cur_sum = 0;
                for (int k = 0; k < row; k++) {
                    if(j == i){
                        temp[k] = nums[k][j];
                    }else {
                        temp[k] += nums[k][j];
                    }
                    cur_sum += temp[k];
                    if (sum < cur_sum){
                        sum = cur_sum;
                    }
                    if (cur_sum < 0){
                        cur_sum = 0;
                    }
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
