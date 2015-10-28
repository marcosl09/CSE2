//Marcos Lozano Mendez
//CSE 2
//October 15, 2015
//Methods: It figures out the average, the median, and it prints out the results

import java.util.Scanner;//imports scanner
public class Methods{//class
    
    public static double Mean(double[] a){//mean method
        double sum = 0;//starts variable sum at 0
        for(int j = 0; j < a.length - 1; j++){//runs until j reaches 1 less than the size of the array
            sum += a[j];//adds the values of the array into sum
        }//end of for loop
        return sum / a.length;//returns the mean of the array
    }
    public static double Median(double[] b){//median method
        int n = b.length;//gets length of the array
        if(n%2 == 0){//checks if array has an even amount of elements
            double m = (b[n/2] + b[(n/2) + 1]) / 2;//gets the two median numbers and finds the average which is the median
            return m;//returns the median
        }
        else{//if array has an odd amount of elements is
            return b[( n /2) + 1]; //finds middle and returns it as the median
        }
    }
    
    public static void Print(double a, double b){//method for printing out the answers
        System.out.println("The mean is: " + a);
        System.out.println("The median is: " + b);
    }
    public static void main(String[] args){//main method
        Scanner Al = new Scanner(System.in);//intiliazes the scanner 
        
        double[] numArray = new double[10];//array of 10 elements set for memory
        
        for(int i = 0; i <= numArray.length - 1; i++){//runs to fill the array with 10 numbers
            System.out.print("Enter a number: ");//asks user for number
            numArray[i] = Al.nextDouble();//stores the number in the array for current element
        }
        
        Print(Mean(numArray), Median(numArray));//calls print method to print answers
    }
    
}