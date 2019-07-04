package com.company.Doubts;

import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();

        boolean[][] maze = new boolean[row][col]; //By default all the value are false.
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int n = s.nextInt();
                if(n == 1){
                    maze[i][j] = true;
                }
            }
        }

        maze("", 0,0,row-1,col-1,maze);
    }

    public static void maze(String path, int c_row, int c_col,int row,int col, boolean[][] maze){
        if(c_row == row && c_col == col){
            System.out.println(path);
            return;
        }

        if(c_row> row || c_col > col){
            return;
        }

        if(!maze[c_row][c_col]){
            return;
        }
        maze[c_row][c_col] = false;

        maze(path + "R",c_row,c_col+1,row,col,maze);
        maze(path + "D",c_row+1,c_col,row,col,maze);

        maze[c_row][c_col] = true;

    }


}

