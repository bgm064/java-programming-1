package week6;

import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a string: ");
		String str = input.nextLine();
		
		if (str.matches("[aeiouyåäöAEIOUYÅÄÖ]*")) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}

	}

}