package Practice.HackerBlocks;

import com.company.Lecture5.ArrayIntro;

public class NumberFreqList {
    public static void main(String[] args) {
//        System.out.println();
        int[] nums = {0,1,4,3,0};
        int n = max(nums);
        int[] temps = new int[n+1];
        for (int i = 0; i < nums.length; i++) {
            temps[nums[i]]++;
        }
        ArrayIntro.display(temps);
    }

    public static int max(int[] nums){
        int max = nums[0];
        for (int i = 0; i < nums.length ; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

}
