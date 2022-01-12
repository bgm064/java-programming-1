package week2;

import java.util.Scanner;

public class IntegerDivision {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter dividend: ");
		int dividend = input.nextInt();
		
		System.out.printf("Enter divisor: ");
		int divisor = input.nextInt();
		
		
		int division = dividend / divisor;
		
		int remainder = dividend - (division * divisor);
		System.out.printf(dividend + " / " + divisor + " = " + division + ", the remainder is " + remainder);

	}

}
