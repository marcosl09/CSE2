//Marcos Lozano Mendez
//CSE 2
//September 14, 2015
//Block: figure out the volume and surfaceArea when the user inputs the lenght, height, width

import java.util.Scanner; //imports the scanner class

public class Block{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//intilizes the scanner class
        
        double lenght, width, height, volume, surfaceArea; //setting up the different variables as doubles
        
        System.out.println("Enter the lenght of the block: ");
        lenght = myScanner.nextDouble();//gets the lenght from the user and stores it
        
        System.out.println("Enter the width of the block: ");
        width = myScanner.nextDouble(); //gets the width from the user and stores it
        
        System.out.println("Enter the height of the block: ");
        height = myScanner.nextDouble(); //gets the height from the user and stores it
        
        volume = lenght * width * height;//multplies the three variables to find the volume
        
        System.out.println("The volume of the block dimmensions " + lenght + " x " + width + " x " + height + " is " + volume);
        
        surfaceArea = (2 * lenght * height) + (2 * width * height ) + (2 * lenght * width);//the surface area of a block formula
        
        System.out.println("The surface area of the block is " + surfaceArea);
        
        
    }//end of main method
}//end of class