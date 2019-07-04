package Practice.Doubts;

import java.util.Scanner;

public class Daily_CodeByte {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int eggs = s.nextInt();
            int floors = s.nextInt();
            Integer[][] mem = new Integer[floors + 1][eggs + 1];
            System.out.println(eggDropDPitr(floors, 2, mem));
        }

    }

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
