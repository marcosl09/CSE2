//Marcos Lozano Mendez
//CSE 2
//Flip: flips a # coins and returns results


import java.util.Scanner;//imports scanner class

public class Flip {//class
	public static void main(String[] args) {//main method
		int y;//stores number
		Scanner Al = new Scanner(System.in);//intizilaizes scanner
		
		System.out.print("Enter a number: ");//asks user for number
		y = Al.nextInt();//stores number
		if(y == 0){//if y == 0 then it does flip method with no parameter
			flip();//calls flip method
		}
		else if(y > 0 && y <= 100){//if y is between 0 and 100 then it does flip method with one parameter
			flip(y);//class flip method
		}
	}

	public static void flip() {//flip method with no parameter
		int x =  (int) (Math.random() * 2);//gets a 0 or 2 randomly
		if(x == 0){//if it's a 0 then it's heads
			System.out.println("Heads "+ x); //prints result
		}
		else if(x ==1){//if it's a 1 the it's tails
			System.out.println("Tails " + x);//prints result
		}
	}
	
	public static void flip(int n){//flip method with one method
		for(int i = 0; i < n; i++){//calls flip method by the number of times entered before
			flip();
		}
		
		
	}

}