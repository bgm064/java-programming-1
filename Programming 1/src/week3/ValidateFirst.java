package week3;

import java.util.Scanner;

public class ValidateFirst {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String number;

		System.out.printf("Enter grade (0-5): ");
		number = input.nextLine();

		try {
			Integer.parseInt(number);
			System.out.println("OK");
		} catch (NumberFormatException e) {
			System.out.println("Please enter an integer.");

		}

	}
}
