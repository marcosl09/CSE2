//Marcos Lozano Mendez
//CSE 2
//October 15, 2015
//Methods: It figures out the average, the median, and it prints out the results

import java.util.Scanner;
public class Methods{
    
    public static double Mean(double[] a){
        double sum = 0;
        for(int j = 0; j < a.length - 1; j++){
            sum += a[j];
        }
        return sum / a.length;
    }
    public static double Median(double[] b){
        int n = b.length;
        if(n%2 == 0){
            double m = (b[n/2] + b[(n/2) + 1]) / 2;
            return m;
        }
        else{
            return b[( n /2) + 1];
        }
    }
    
    public static void Print(double a, double b){
        System.out.println("The mean is: " + a);
        System.out.println("The median is: " + b);
    }
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);
        
        double[] numArray = new double[10];
        
        for(int i = 0; i <= numArray.length - 1; i++){
            System.out.print("Enter a number: ");
            numArray[i] = Al.nextDouble();
        }
        
        Print(Mean(numArray), Median(numArray));
    }
    
}