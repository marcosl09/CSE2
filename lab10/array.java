//Marcos Lozano
//CSE 2
//October 29, 2015

import java.util.Scanner;//imports scanner class
public class array{//class
    public static void main(String[] args){//main method
        Scanner Al = new Scanner(System.in);//intiliazes scanner
        
        int n;//the number of how big the array should be
        int sum = 0;//stores the sum, intiated at 0
        int average;//stores the average
        
        System.out.print("How big should the array be? ");//asks the user 
        n = Al.nextInt();//stores the number
        
        int[] array = new int[n];//intiatializes an empty array with n number of memory
        
        for(int i = 0; i < array.length; i++){//runs into it reaches the end of the array
            array[i] = (int) (Math.random() * 100);//gets a random integer between 0 and 100
            System.out.println("array[" + i +"] is " + array[i]);//prints the number of the index of the array
        }
        for(int j =0; j < array.length; j++){//runs into it reaches the end of the array
            sum += array[j];//sums the values of the array 
        }
        average = sum / array.length;//divides sum by the size of the array
        System.out.println("The sum is: " + sum);//displays the sum
        System.out.println("The average is: " + average);//display the average
        
        for(int k = 0; k < array.length; k++){//runs into it reaches the end of the array
            if(array[k] >= average){//checks if the current elements is bigger or equal to the average
                System.out.println(array[k] + " is greater or equal to the average.");//prints the element
            }
        }
        
    }
    
    
}