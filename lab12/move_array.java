//Marcos Lozano Mendez
//CSE 2
//November 12, 2015


import java.util.Scanner;
public class move_array{
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n;
        int[] array = new int[];
        try{
         n = Al.nextInt();
        array = new int[n];
        }
        catch(Exception e){
            System.out.println("You entered a wrong index " + e);
        }
        
        
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
        
        System.out.println("Enter an index that you want to move to the end: ");
        
        try{
            int index = Al.nextInt();
        }
        catch(Exception e){
            System.out.println("Wrong index");
        }
        
    }
    
}