//Marcos Lozano Mendez
//CSE 2
//October 8, 2015
//Encrypted X: hides an x inside a block of stars

import java.util.Scanner;//imported the Scanner class

public class encrypted_x{//start of class
    public static void main(String[] args){//start of main method
        Scanner Al = new Scanner(System.in);//initializes the Scanner class
        
        int p = 0;//stores the number that will make the x bigger
        
        System.out.print("How big should the x be? ");//ask the user for input
        p = Al.nextInt();//stores the input in the variable
        
        if(p > 100 || p < 0){//runs when the number is above 100 and below 0
            System.exit(-1);//exits the program
        }//end of if
        else{
            for(int i = 0; i < p; i++){//makes the rows
                for(int j = 0; j < p; j++){
                    if( j == i || j == (p-i)){//there is a space needed a certain amount of spaces
                        System.out.print(" ");//puts a space
                    }//end of if
                    else{
                      System.out.print("*");  //puts the star in the row
                    }//end of else
                    
                }//end of for loop with variable j
                System.out.println();//goes to new line
            }//end of for loop with variable i
        }//end of else
        
    }//end of main method
}//end of class