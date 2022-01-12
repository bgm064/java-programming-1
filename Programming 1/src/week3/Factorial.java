package week3;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i, fact = 1;
		String str = null;
		int num = -1;
		

		while (true) {

			try {
				System.out.printf("Enter a non-negative integer: ");
				str = input.nextLine();
				num = Integer.parseInt(str);
				
				for (i = 1; i <= num; i++) {
					fact = fact * i;
				}

				if (num < 0) {
					System.out.println("Please enter a non-negative integer.");
					return;

				} else {
					System.out.printf(num + "! = " + fact);
					return;
				}

			} catch (NumberFormatException nfe) {
				System.out.println("Please enter a non-negative integer.");
				return;
			}

		}
	}

}