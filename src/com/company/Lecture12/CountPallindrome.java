package com.company.Lecture12;

public class CountPallindrome {
    public static void main(String[] args) {
        String line = "aabbaa";
        System.out.println(count(line));

    }

    public static int count(String line){
        int count = 0;

        for(int i = 0; i < line.length();i++){

            //Check for odd length
            int left = i;
            int right = i;
            while(left >= 0 && right < line.length()){
                if(line.charAt(left--) == line.charAt(right++)){
                    count++;
                }else{
                    break;
                }
            }

            //Check for even length
            left = i;
            right = i+1;
            while(left >= 0 && right < line.length()){
                if(line.charAt(left--) == line.charAt(right++)){
                    count++;
                }else{
                    break;
                }
            }
        }

        return count;
    }
}
