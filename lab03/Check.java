//Marcos Lozano Mendez
//September 10, 2015
//CSE 2
//Check: help determine how much will a check be split off to.

import java.util.Scanner;

public class Check{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the orginal cost of the check in this form xx.xx: ");
        double checkCost = myScanner.nextDouble(); //the original amount of the check
        System.out.println("Enter the percentage that you wish to pay in a whole number (in form xx): ");
        double tipPercent = myScanner.nextDouble(); //percentage of check
        
        tipPercent /= 100; //converts percent to decimal
        
        System.out.println("Enter the amount of people that went to dinner: ");
        int numPeople = myScanner.nextInt(); //number of people
        
        double totalCost; //total cost will include tip
        double costPerPerson; //split of the check
        int dollars; //whole dollar amount of check
        int dimes, pennies; //for the cents
        
        totalCost = checkCost + (1 * tipPercent * checkCost); // adding the tip and the check to get the whole total cost
        
        costPerPerson = totalCost / numPeople; //dividing the check for each person who went to dinner
        
        dollars = (int) costPerPerson; //gets the whole dollar amount
        
        dimes = (int) (costPerPerson * 10) % 10; //gets number of dimes of the cost per person
        
        pennies = (int) (costPerPerson * 100) % 10; //gets number of pennies of the cost per person
        
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        
    }//end of main method
}//end of class