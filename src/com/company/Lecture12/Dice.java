package com.company.Lecture12;

public class  Dice {
    public static void main(String[] args) {
        int n = 4;
        Integer[] mem = new Integer[n + 1];
        Integer[] memory = new Integer[n + 1];
        System.out.println(board(n, 3));
        System.out.println(boardDP(n, 3, mem));
        System.out.println(boardDPitr(n,3,memory));

    }

    public static int board(int target, int dice) {
        if (target == 0) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= dice && i <= target; i++) {
            count += board(target - i, dice);
        }
        return count;
    }

    public static int boardDP(int target, int dice, Integer[] mem) {
        if (target == 0) {
            return 1;
        }

        if (mem[target] != null) {
            return mem[target];
        }

        int count = 0;
        for (int i = 1; i <= dice && i <= target; i++) {
            count += boardDP(target - i, dice,mem);
        }
        mem[target] = count;


        return count;
    }

    public static int boardDPitr(int target, int dice,Integer[] mem){
        for(int t = 0; t <= target;t++){
            if(t==0){
                mem[t] = 1;
            }else {
                int count = 0;
                for (int i = 1; i <= dice && i <= t; i++) {
                    count += mem[t - i];
                }
                mem[t] = count;
            }
        }

        return mem[target];
    }
}
