//Marcos Lozano Mendez
//CSE 002
//October 1, 2015
//Average Grade: find the average of grades inputed by the user, does not accept grades below 0 or above 100, exits program if 999 is entered

import java.util.Scanner;//imports the scanner class

public class averageGrade{
    public static void main(String[] args){//main method
    Scanner Al = new Scanner(System.in);//initializes the scanner 
    
    int avg;//stores the average of grades
    int counter=0 ;//keeps count on how many times the loop has repeated
    int inputNum = 0;//number that user brings in, initialized at zero so while loop runs
    int numSum = 0;
    while(inputNum != 999){//runs only when inputNum is not 999
        System.out.println("Enter a grade (Entering 999 exits the program): ");//ask the user to input a number
        inputNum = Al.nextInt();//stores the input
        
        if(inputNum < 0 || (inputNum >100 && inputNum != 999)){//runs when the number is below zero or above 100
            System.out.println("Invalid Grade has been entered");//displays error
            inputNum = 0;//to avoid the error being added in the average
        }
        else if(inputNum == 999){//runs if number is 999
            break;//gets out of if-statement and finishes while loop
        }
        else{
            numSum +=inputNum;//keeps the sum of the inputNum being entered
        }
        counter += 1;//keeps the number of iterations
    }
    avg = numSum / counter;//equation for average
    System.out.println("The average of  the grades is: " + avg);//displays the average
    }//end of main method
}//end of class