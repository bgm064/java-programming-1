package week7;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter first string: ");
		String first = input.nextLine();

		System.out.printf("Enter second string: ");
		String second = input.nextLine();

		System.out.printf(isAnagram(first, second));

	}

	public static String isAnagram(String first, String second) {
		
		String output = "";
		int counter = 0;
		String x = first.replaceAll("\\s", "").replaceAll("\\.", "").replaceAll("\\,", "").toLowerCase();
		String y = second.replaceAll("\\s", "").replaceAll("\\.", "").replaceAll("\\,", "").toLowerCase();

		if (first.matches("[a-zåäöA-ZÅÄÖ\\s\\.\\,]+")) {
			for (int i = 0; i < x.length(); i++) {
				for (int j = 0; j < x.length(); j++) {
					if (x.charAt(i) == y.charAt(j)) {
						counter++;
						break;
					}
				}
			}

		} else {
			output = "No anagram.";
		}

		if (counter > 0 && counter == (x.length())) {
			output = "Anagram!";
		} else {
			output = "No anagram.";
		}

		return output;

	}

}