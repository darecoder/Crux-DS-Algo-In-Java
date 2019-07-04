package Assignment_6;

public class Q7 {
    public static void main(String[] args) {
        int[] nums = {3,6,1,9,0,5,2,7};
        System.out.println(isIn(nums,0,5));
    }

    public static boolean isIn(int[] nums,int index, int target){
        if(index == nums.length){
            return false;
        }
        if(nums[index] == target){
            return true;
        }
        return isIn(nums,index+1,target);
    }
}
