package week6;

import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.printf("Enter a string: ");
		String str = input.nextLine();
		
		int letters = 0;
		int digits = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetterOrDigit(str.charAt(i))) {
				if (Character.isDigit(str.charAt(i))) {
					digits++;
				} else {
					letters++;
				}
			}
		}
		
		System.out.println(letters + " letter(s)");
		System.out.println(digits + " digit(s)");

	}

}