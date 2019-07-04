package Assignment_6;

public class Q6 {
    public static void main(String[] args) {
        int[] nums = {1,6,20,34,68,70,95};
        System.out.println(isSorted(nums,0));
    }

    public static boolean isSorted(int[] nums,int index){
        if(index == nums.length - 1){
            return true;
        }
        if(nums[index] > nums[index+1]){
            return false;
        }
        return isSorted(nums,index+1);
    }
}
