//Marcos Lozano Mendez
//CSE 2

import java.util.Scanner;
public class MineSweeper{
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);
        
        System.out.println("Enter how big the board should be: ");
        int n = Al.nextInt();
        
        char[][] board = new char[n][n];
        int mX = 0;
        int mY =0;
        
        for(int i = 0; i < board.length/ 2; i++){
            mX  =  (int)(Math.random() * n);
            mY = (int)(Math.random() * n);
            board[mX][mY] = 'm';
        }
        
        for(int j = 0; j < n; j++ ){
            for(int k = 0; k < n; k++){
                System.out.print(board[j][k] + " ");
            }
            System.out.println(" ");
        }
    }
}