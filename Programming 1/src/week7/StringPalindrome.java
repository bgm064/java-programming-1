package week7;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter a string: ");
		String str = input.nextLine();

		System.out.printf(isPalindrome(str));

	}

	public static String isPalindrome(String str) {

		String output = "";
		String x = str.replaceAll("[\\s\\,\\.\\:\\;\\?\\!\\-\"\\']", "").toLowerCase();
		String y = "";

		if (str.matches("[a-zåäöA-ZÅÄÖ\\s\\,\\.\\:\\;\\?\\!\\-\"\\']+")) {

			for (int i = x.length() - 1; i >= 0; i--) {
				char a = x.charAt(i);
				y += a;
			}
			
			if (x.length() > 0 && x.matches(y)) {
				output = "The text is a palindrome.";
			} else {
				output = "No palindrome";
			}

		} else {
			output = "No palindrome";
		}
		return output;
	}
	
}