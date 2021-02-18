package com.company.Lecture12;

public class EggDrop {
    public static void main(String[] args) {
        int floors = 100;
        int eggs = 2;
        Integer[][] mem = new Integer[floors+1][eggs+1];
//        System.out.println(eggDrop(floors,eggs));
//        System.out.println(eggDropDP(floors,eggs,mem));
        System.out.println(eggDropDPitr(floors,eggs,mem));

    }

    public static int eggDrop(int floors,int eggs){
        if(floors == 0){
            return 0;
        }

        if(eggs == 1){
            return floors;
        }

        int minimum = floors;
        for (int f = 1; f <= floors; f++) {
            int down = eggDrop(f - 1,eggs -1);
            int up = eggDrop(floors - f,eggs);

            int max = 1 + Math.max(down,up);
            if(max < minimum){
                minimum = max;
            }
        }
        return minimum;
    }

    public static int eggDropDP(int floors,int eggs, Integer[][] mem){
        if(floors == 0){
            return 0;
        }

        if(eggs == 1){
            return floors;
        }

        int minimum = floors;
        for (int f = 1; f <= floors; f++) {
            int down = eggDrop(f - 1,eggs -1);
            int up = eggDrop(floors - f,eggs);

            int max = 1 + Math.max(down,up);
            if(max < minimum){
                minimum = max;
            }
        }

        mem[floors][eggs] = minimum;
        return mem[floors][eggs];
    }

    //HOMEWORK
    public static int eggDropDPitr(int floors,int eggs,Integer[][] mem){
        for (int f = 0; f <= floors; f++) {
            for (int e = 1; e <= eggs; e++) {
                if(e == 1){
                    mem[f][e] = f;
                }else if(f == 0){
                    mem[f][e] = 0;
                }else{
                    mem[f][e] = floors;
                    for (int i = 1; i <= f; i++) {
                        int max = 1 + Math.max(mem[i-1][e-1],mem[f-i][e]);
                        if(max < mem[f][e]){
                            mem[f][e] = max;
                        }
                    }
                }
            }
        }

        return mem[floors][eggs];
    }
}
