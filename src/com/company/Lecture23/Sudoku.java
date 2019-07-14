package com.company.Lecture23;

import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}};
        
        sudoku(board, 0,0);

    }

    public static void sudoku(int[][] board, int row, int col){
        if(row == board.length){
            display(board);
            return;
        }

        if(col == board.length){
            sudoku(board,row+1, 0);
            return;
        }

        if(board[row][col] == 0){
            for (int i = 1; i <= 9; i++) {
                if(isSafe(board, row, col, i)){
                    board[row][col] = i;
                    sudoku(board, row, col+1);
                    board[row][col] = 0;
                }
            }
        }else {
            sudoku(board, row, col+1);
        }
    }

    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == n){
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == n){
                return false;
            }
        }

        int r_block = row/3;
        int c_block = col/3;

        for (int r = r_block*3; r < (r_block+1)*3; r++) {
            for (int c = c_block*3; c < (c_block+1)*3; c++) {
                if (board[r][c] == n){
                    return false;
                }
            }
        }

        return true;
    }
}
