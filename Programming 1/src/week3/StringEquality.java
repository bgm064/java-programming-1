package week3;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("Enter first string: ");
		String first = input.next();

		System.out.printf("Enter second string: ");
		String second = input.next();

		boolean equal = first.equals(second);

		if (equal == true) {
			System.out.print("Equal");
		}

		else {
			System.out.print("Not equal");
		}

	}

}
