//Marcos Lozano Mendez
//CSE 2
//October 8, 2015
//Encrypted X: hides an x inside a block of stars

import java.util.Scanner;

public class encrypted_x{
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);
        
        int p = 0;
        
        System.out.print("How big should the x be? ");
        p = Al.nextInt();
        
        if(p > 100 || p < 0){
            System.exit(-1);
        }
        else{
            for(int i = 0; i < p; i++){
                for(int j = 0; j < p; j++){
                    if( j == i || j == (p-i)){
                        System.out.print(" ");
                    }
                    else{
                      System.out.print("*");  
                    }
                    
                }
                System.out.println();
            }
        }
        
    }
}