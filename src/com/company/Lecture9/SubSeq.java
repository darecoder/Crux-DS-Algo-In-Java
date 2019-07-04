package com.company.Lecture9;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String chars = "abc";
        ArrayList<String> list = new ArrayList<String>();
        subseqList("", chars, list);
        System.out.println(list);
//        subseq("", chars);
//        subseq2("", chars);
//        permutation("", chars);
//        System.out.println(countsubseq2("", chars));
    }

    public static void subseq(String proc, String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subseq(proc + ch, unproc);
        subseq(proc, unproc);
    }

    public static void subseqList(String proc, String unproc, ArrayList list){
        if(unproc.isEmpty()){
            if(!proc.isEmpty()){
                list.add(proc);
            }
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subseqList(proc + ch, unproc, list);
        subseqList(proc, unproc, list);
    }


    public static void subseq2(String proc, String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subseq2(proc + ch, unproc);
        subseq2(proc + (int)ch, unproc);
        subseq2(proc, unproc);
    }

    public static int countsubseq2(String proc, String unproc){
        if(unproc.isEmpty()){
            return 1;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        int count = 0;

        count += countsubseq2(proc + ch, unproc);
        count += countsubseq2(proc + (int)ch, unproc);
        count += countsubseq2(proc, unproc);

        return count;
    }

    public static void permutation(String proc, String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }

        char ch  = unproc.charAt(0);
        unproc = unproc.substring(1);

        for (int i = 0; i <= proc.length() ; i++) {
            String first = proc.substring(0,i);
            String second  = proc.substring(i);

            permutation(first + ch + second, unproc);
        }

    }

}


