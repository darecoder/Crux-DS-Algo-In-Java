package com.company.Lecture9;

import java.util.ArrayList;

public class Board {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
//        board("", 4, 3);
////        System.out.println(countboard("", 4, 3));
        boardList("", 4, 3,list);
        System.out.println(list);
    }

    public static void board(String proc, int target, int face){
        if(target == 0){
            System.out.println(proc);
            return;
        }

        for (int i = 1; i <= face && i <= target ; i++) {
            board(proc+i, target-i, face);
        }
    }

    public static void boardList(String proc, int target, int face, ArrayList<String> list){
        if(target == 0){
            list.add(proc);
            return;
        }

        for (int i = 1; i <= face && i <= target ; i++) {
            boardList(proc+i, target-i, face, list);
        }
    }

    public static int countboard(String proc, int target, int face){
        if(target == 0){
            return 1;
        }

        int count = 0,acc = 0;

        for (int i = 1; i <= face && i <= target ; i++) {
            acc += countboard(proc+i, target-i, face);
        }
        count += acc;
        return count;
    }
}
