package _7;

import java.io.FileOutputStream;

public class SodokuSolver {
    public static boolean SudokuSolver(int sudoku[][],int row,int col){
//base case
        if(row==9){
            return true;
        }
        int nextrow=row, nextcol=col+1;
        if (col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if (sudoku[row][col]!=0){
            return SudokuSolver(sudoku,nextrow,nextcol);
        }
        for (int digit=1; digit<=9; digit++){
            if (isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(SudokuSolver(sudoku,nextrow,nextcol)){//solution exist
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
    return false;
    }
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //for colum
        for (int i=0; i<=8;i++){
            if (sudoku[i][col]==digit){
                return false;
            }
        }
        //for row
        for (int i=0; i<=8;i++){
            if (sudoku[row][i]==digit){
                return false;
            }
        }
        //for inside grid grid size of 3x3
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for (int i=sr; i<sr+3; i++){
            for (int j=sc; j<sc+3; j++){
                if (sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printsudoku(int sudoku[][]){
        for (int i=0; i<sudoku.length;i++){
            for (int j=0; j<sudoku.length;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     int sudoku[][]= { {3, 0, 6, 5, 0, 8, 4, 0, 0},
             {5, 2, 0, 0, 0, 0, 0, 0, 0},
             {0, 8, 7, 0, 0, 0, 0, 3, 1},
             {0, 0, 3, 0, 1, 0, 0, 8, 0},
             {9, 0, 0, 8, 6, 3, 0, 0, 5},
             {0, 5, 0, 0, 9, 0, 6, 0, 0},
             {1, 3, 0, 0, 0, 0, 2, 5, 0},
             {0, 0, 0, 0, 0, 0, 0, 7, 4},
             {0, 0, 5, 2, 0, 6, 3, 0, 0} };
     if(SudokuSolver(sudoku,0,0)){
         System.out.println("soultion exist");
         printsudoku(sudoku);
     }
     else System.out.println("solution does not exist");

    }

}
