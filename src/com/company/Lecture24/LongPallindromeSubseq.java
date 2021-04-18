package com.company.Lecture24;

public class LongPallindromeSubseq {
    public static void main(String[] args) {
        System.out.println(lps("aaceaa",0,5));
    }

    public static int lps(String line, int start, int end){
        if(start > end){
            return 0;
        }
        if(start == end){
            return 1;
        }
        int res;
        if(line.charAt(start) == line.charAt(end)){
            res = 2 + lps(line, start+1,end-1);
        }else {
            res = Math.max(lps(line,start,end-1), lps(line,start+1,end));
        }
        return res;
    }
}
