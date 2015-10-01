//Marcos Lozano Mendez
//CSE 002
//October 1 , 2015
//time sheets: computes the payroll of all the employees entered

import java.util.Scanner;//imports the scanner class

public class timeSheets{
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);//intiliazes the scanner
        
        int employeeNum;//number of employees
        int payPerHour;//number for pay per hour
        int hours;//hours for the day
        int weekHours = 0;//stores the addition of hours for the week
        int total; //stores the total amount of pay for one employee
        int totalAll = 0;//stores the total amount of pay for all employees
        
        System.out.print("Enter the number of employees: ");//ask the user for number of employees
        employeeNum = Al.nextInt();//stores the number of employees
        
        for(int i = 1; i <= employeeNum; i++ ){
            System.out.print("Enter the pay per hour for employee " + i + " (in cents): ");//ask for the pay per hour
            payPerHour = Al.nextInt();//stores pay per hour for current employee
            for(int j = 1; j <= 5; j++){
                System.out.print("Enter the number of hours for day " + j + ": ");//ask for number of hour for that day
                hours = Al.nextInt();//stores the hours for that day
                weekHours += hours;//add the hours of that day and sums it up for the total week hour
            }
            total = weekHours * payPerHour;//finds the total pay
            System.out.println("Pay for employee " + i + " is " + total + " in cents");//displays the total
            totalAll += total;//adds up the total
            weekHours = 0;//resets the weekHours so it doesn't keep adding the hours 
        }
        System.out.println("Pay for all employees is: " + totalAll + " in cents."); //displays the total for all employees
        
        
    }//end of main method
}//end of class