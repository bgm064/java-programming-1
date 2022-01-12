package week3;

import java.util.*;

public class StringLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String first;
		String next;
		int sum = 0;

		System.out.printf("Enter first string: ");
		first = input.nextLine();
		sum = sum + first.length();

		if (first.equals("quit")) {

			System.out.printf("The total length is 0");
			return;
		}

		else {
			System.out.printf("Enter a string: ");
			next = input.nextLine();
			sum = sum + next.length();
		}

		while (!next.equals("quit")) {
			System.out.printf("Enter a string: ");
			next = input.nextLine();
			sum = sum + next.length();
		}
		
		int noQuit = sum - 4;

		System.out.printf("The total length is " + noQuit);
		input.close();

	}

}
