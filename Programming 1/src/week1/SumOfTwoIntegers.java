package week1;

import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first integer: ");
		int firstInteger = input.nextInt();

		System.out.println("Enter second integer: ");
		int secondInteger = input.nextInt();

		int sum = firstInteger + secondInteger;
		System.out.println(firstInteger + " + " + secondInteger + " = " + sum);

	}

}
