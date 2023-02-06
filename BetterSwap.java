package PracticeQ;

import java.util.Scanner;

public class BetterSwap {

	public static void main(String[] args) {
		int numberOne, numberTwo;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the First Number: ");
	      numberOne = scan.nextInt();
	      System.out.print("Enter the Second Number: ");
	      numberTwo = scan.nextInt();
	      
	      System.out.println("--Before swap--");
	        System.out.println("First number = " + numberOne);
	        System.out.println("Second number = " + numberTwo);
	        
	        numberOne = numberOne + numberTwo;
	        numberTwo = numberOne - numberTwo;
	        numberOne = numberOne - numberTwo;
	        
	        System.out.println("--After swap--");
	        System.out.println("First number = " + numberOne);
	        System.out.println("Second number = " + numberTwo);

	}

}
