//Marcos Lozano Mendez
//CSE 002
//October 1, 2015
//Average Grade: find the average of grades inputed by the user, does not accept grades below 0 or above 100, exits program if 999 is entered

import java.util.Scanner;//imports the scanner class

public class averageGrade{
    public static void main(String[] args){//main method
    Scanner Al = new Scanner(System.in);//initializes the scanner 
    
    int avg;//stores the average of grades
    int counter;//keeps count on how many times the loop has repeated
    int inputNum = 0;//number that user brings in, initialized at zero so while loop runs
    int numSum = 0;
    while(inputNum != 999){//runs only when inputNum is not 999
        System.out.println("Enter a grade (Entering 999 exits the program): ");//ask the user to input a number
        inputNum = Al.nextInt();//stores the input
        
        if(inputNum < 0 || inputNum > 99){
            System.out.println("Invalid Grade has been entered");
        }
        else{
            numSum += inputNum;
        }
    }
    
    System.out.println(numSum);
    
    
     
     
        
    }//end of main method
}//end of class