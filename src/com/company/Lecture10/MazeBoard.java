package com.company.Lecture10;

public class MazeBoard {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;

        boolean[][] maze = new boolean[row+1][col+1];  //By default all the value are false.

        maze("", 1,0,row,col,maze);


    }

    public static void maze(String path, int c_row, int c_col,int row,int col, boolean[][] maze){
        if(c_row == row && c_col == col){
            System.out.println(path);
            return;
        }

        if(c_col < 0 ||c_row< 0 || c_row> row || c_col > col){
            return;
        }

        if(maze[c_row][c_col]){
            return;
        }
        maze[c_row][c_col] = true;

        maze(path + "U",c_row-1,c_col,row,col,maze);
        maze(path + "R",c_row,c_col+1,row,col,maze);
        maze(path + "D",c_row+1,c_col,row,col,maze);
        maze(path + "L",c_row,c_col-1,row,col,maze);

        maze[c_row][c_col] = false;

    }
}
