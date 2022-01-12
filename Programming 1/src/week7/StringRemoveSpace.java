package week7;

import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("\"" + removeExtraSpace(str.trim()) + "\"");

	}

	public static String removeExtraSpace(String str) {
		return str.replaceAll("\\s+", " ");
	}
	
}