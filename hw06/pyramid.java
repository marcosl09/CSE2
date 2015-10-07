//Marcos Lozano Mendez
//CSE 002
//October 10, 2015
//Pyramid: User inputs what size of pyramid they want and the program displays it

import java.util.Scanner; //imports the scanner class
public class pyramid{
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);//initializes the scanner class
        
        int p =0;//stores the number of lines for the pyramid
        String asterick = " *";//stores the asterick
        
        System.out.print("What size pyramid? ");//commands user to input number
        p = Al.nextInt();//stores number of lines
        
        for(int i = 0; i < p * 2; i++){//runs only when i is less than double the p
        	for(int j = 0; j < (p - i ) ; j++){//runs only when j is less than p minus i
        		System.out.print(" ");//prints out spaces
        	}//end of for loop with variable j
        	if(i%2 == 0){//only runs evens
        		for(int k =0; k <= i ; k++){//runs onlyy when k is less or equal to the i
        			System.out.print(asterick);//prints the *
        		
        		}//end of for loop with varible k
            
        	}//end of if statement
        	System.out.println();//prints to next line
        }//end of for loop with variable i 
     
    
    }//end 
}//end of class