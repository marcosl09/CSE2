//Marcos Lozano Mendez
//CSE 2
//September 17, 2015
//Calculator: prompts the user for two numbers and the operator and does the math required for it

import java.util.Scanner;

public class Calculator{
    //main method
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);
        int a, b;
        int calc = 0;
        String operator;
        
        System.out.print("Enter an integer: ");
        a = Al.nextInt();
        
        System.out.print("Enter a second integer: ");
        b = Al.nextInt();
        Al.nextLine();
        
        System.out.print("Enter a operation (+ , - , * , /): ");
        operator = Al.nextLine();
        
        switch(operator){
            case "+":
                calc = a + b;
                System.out.println(a + " " + operator + " " + b + " = " + calc);
                break;
            case "-":
                calc = a - b;
                 System.out.println(a + " " + operator + " " + b + " = " + calc);
                break;
            case "*":
                calc = a * b;
                 System.out.println(a + " " + operator + " " + b + " = " + calc);
                break;
            case "/":
                calc = a / b;
                 System.out.println(a + " " + operator + " " + b + " = " + calc);
                break;
            default:
                System.out.println("Illegal Operator");
        }
       
    }//end of main method
}//end of class