package week6;

import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.printf("Enter a string: ");
		String str = input.nextLine();
		
		int chars = str.length();
		String caps = str.toUpperCase();
		String lows = str.toLowerCase();
		
		System.out.println(chars + " characters");
		System.out.println(caps);
		System.out.println(lows);

	}

}