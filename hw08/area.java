//Marcos Lozano Mendez
//CSE 2
//October 27, 2015
//Area: figures out the area using overloaded methods of a circle, rectangle, and trapazoid


import java.util.Scanner;
public class area{
    
    public static double Area(int radius){
        return 3.14 * radius * radius;
    }
    public static double Area(int length, int width){
        return length * width;
    }
    public static double Area(int height, int base1, int base2){
        return (.5) * (base1 + base2) * height;
    }
    public static void main(String[] args){
        Scanner Al = new Scanner(System.in);
        int shape = 1;
        int num1, num2, num3;
        while(shape !=1 || shape !=2 || shape !=3){
            System.out.print("Enter the number corresponding to the shape you want circle(1), rectangle (2), trapazoid(3), to exit(0): ");
            shape = Al.nextInt();
            
            if(shape ==1 || shape ==2 || shape ==3){
                break;
            }
            
            if(shape==0){
                System.exit(0);
            }
        }
        if(shape == 1){
            System.out.print("Enter radius: ");
            num1 = Al.nextInt();
            System.out.println("Area of the circle is: " + Area(num1));
        }
        else if(shape == 2){
            System.out.print("Enter the length: ");
            num1 = Al.nextInt();
            System.out.print("Enter the width: ");
            num2 = Al.nextInt();
            System.out.println("Area of the rectangle is: " + Area(num1, num2));
        }
        else if(shape == 3){
            System.out.print("Enter the height: ");
            num1 = Al.nextInt();
            System.out.print("Enter base 1: ");
            num2 = Al.nextInt();
            System.out.print("Enter base 2: ");
            num3 = Al.nextInt();
            System.out.println("Area of the trapazoid is: " + Area(num1, num2, num3));
        }
    
        
    }
    
    
}