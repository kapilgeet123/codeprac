package TestCode1;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		
		System.out.print("Enter the first integer: ");
		
		Scanner s = new Scanner(System.in);
		
		num1 = s.nextInt();
		
		System.out.print("Enter the second integer: ");
		
		num2 = s.nextInt();
		
		System.out.print("Enter the second integer: ");
		
		num3 = s.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("The bigger number is " + num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("The bigger number is " + num2);
		}
		else {
			System.out.println("The bigger number is " + num3);
		}
	}

}
