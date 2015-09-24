//Marcos Lozano Mendez
//CSE 2
//September 24, 2015
//Calculator Special: prompts the user to enter two numbers and an operator, then the program does the math, uses a while loop instead of just a switch statement

import java.util.Scanner;//imports scanner

public class CalculatorSpecial{
    //main method
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);//makes scanner
        int a, b; //stores the two integers
        int calc = 0; //stores the answer
        String operator; //stores the operator
        String response = "y";//stores the user's answer to see if they want to continue
        boolean check = true; //stores the true or false to run the while loop
        
        while(check){//if check is true then it runs the code between the curly brackets
            System.out.print("Enter an integer: ");//ask the user for an integer
            a = Al.nextInt(); // gets the first integer from the keyboard
        
            System.out.print("Enter a second integer: ");//ask the user for an integer
            b = Al.nextInt(); //gets the second integer from the keyboard
            Al.nextLine();//gets the extra enter key input so the next nextLine() command can run
        
            System.out.print("Enter a operation (+ , - , * , /): ");//ask the user for an operator to do
            operator = Al.nextLine();//gets the operator from the keyboard
        
        switch(operator){//uses the variable operator to check each case
            case "+"://if operator is '+' then it runs this case
                calc = a + b; //adds the two operators
                System.out.println(a + " " + operator + " " + b + " = " + calc);//displays the math to users
                break;//stops the switch statement
            case "-"://if operator is '-' then it runs this case
                calc = a - b;//subtracts the two operators
                 System.out.println(a + " " + operator + " " + b + " = " + calc);//displays the math to users
                break;//stops the switch statement
            case "*"://if operator is '*' then it runs this case
                calc = a * b;//multiplies the two operators
                 System.out.println(a + " " + operator + " " + b + " = " + calc);//displays the math to users
                break;//stops the switch statement
            case "/"://if operator is '/' then it runs this case
                calc = a / b;//divides the two operators
                 System.out.println(a + " " + operator + " " + b + " = " + calc);//displays the math to users
                break;//stops the switch statement
            default://if something else other than an operator is typed then the default runs
                System.out.println("Illegal Operator");
        }//end of switch statement
        
        System.out.print("Type n or N to stop: ");//ask the user whether to keep going
        response = Al.next();//gets input from keyboard
        
        if(response.equals("n") || response.equals("N")){//check if the answer was 'n' or 'N'
            check = false;//if they are then this is false and the while loop stops
        }//end of if
        
            
        }
        
    }//end of main method
}//end of class 