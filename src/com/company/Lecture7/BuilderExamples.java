package com.company.Lecture7;

public class BuilderExamples {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        int[] nums = {1,5,2,9,4};
        builder.append("[");

        for (int i = 0; i < nums.length ; i++) {
            builder.append(nums[i]);
            if(i < nums.length-1){
                builder.append(", ");
            }
        }

        builder.append("]");

//        builder.replace(1, 2,"ab");
//        builder.delete(1,2);
//        builder.insert(1, "oo");

        System.out.println(builder);
    }
}
