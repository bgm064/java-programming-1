package week7;

import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {
			System.out.printf("Enter a decimal number: ");
			String str = input.nextLine();

			double parse = Double.parseDouble(str.replace(',', '.'));
			int comma = str.indexOf(",");
			int dot = str.indexOf(".");
			int size = str.length() - 1;
			int decimal = 0;

			if (comma >= 1) {
				decimal = size - comma;
			} else if (dot >= 1) {
				decimal = size - dot;
			}

			if (decimal > 0) {
				System.out.printf(decimal + " decimal place(s)");
			} else {
				System.out.printf("Please enter a proper decimal number");
			}
		} catch (NumberFormatException nfe) {
			System.out.printf("Please enter a proper decimal number");
		}

	}
	
}