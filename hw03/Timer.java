//Marcos Lozano Mendez
//CSE 2
//September 14, 2015
//Timer: Gives the amount of time until dinner when the user enters the current time and dinner time

import java.util.Scanner; //imports scanner

public class Timer{
    public static void main(String[] args){
     Scanner myScanner = new Scanner(System.in); //intializes the scanner
     int currentTime, dinnerTime, differenceHrs, differenceMins; //variables to store the times
     
     System.out.println("Enter the current time (format HHMM): ");
     currentTime = myScanner.nextInt(); //stores the current time 
     
     System.out.println("Enter the time you'll eat dinner (HHMM): ");
     dinnerTime = myScanner.nextInt(); //stores the time dinner will be at
     
     differenceHrs = (dinnerTime - currentTime) / 100; // figures the difference between hours
     
     differenceMins = (dinnerTime - currentTime) % 100;//figures the difference of minutes
    
    System.out.println("You have " + differenceHrs + " hours and " + differenceMins + " minutes until dinner");
    }//end of main method
}//end of class