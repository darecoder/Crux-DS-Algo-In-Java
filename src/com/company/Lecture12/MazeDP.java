package com.company.Lecture12;

public class MazeDP {
    public static void main(String[] args) {
        int row = 4,col = 4;
        Integer[][] mem = new Integer[row+1][col+1];
        Integer[][] memory = new Integer[row+1][col+1];

        System.out.println(maze2(3,3));
        System.out.println(mazeDP(3,3,mem));
        System.out.println(mazeDPitr(3,3,memory));

    }


    public static int maze2(int row,int col){    //Reach (1,1)
        if(row == 1 || col == 1){
            return 1;
        }

        return maze2(row-1,col) + maze2(row,col-1);
    }

    public static int mazeDP(int row, int col,Integer[][] mem){
        if(row == 1 || col == 1){
            return 1;
        }

        if(mem[row][col] != null){
            return mem[row][col];
        }

        mem[row][col] = mazeDP(row-1,col,mem) + mazeDP(row,col-1,mem);

        return mem[row][col];
    }

    public static int mazeDPitr(int row,int col,Integer[][] mem){
        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= col; j++) {
                if(i == 1 || j == 1){
                    mem[i][j] = 1;
                }else{
                    mem[i][j] = mem[i - 1][j] + mem[i][j-1];
                }
            }
        }

        return mem[row][col];
    }
}
