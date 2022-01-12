package week6;

import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.printf("Enter first name: ");
		String first = input.nextLine();
		
		System.out.printf("Enter surname: ");
		String last = input.nextLine();
		
		System.out.println(createUsername(first, last));

	}

	public static String createUsername(String first, String last) {
		String ok = "";
		String not = "Not enough letters to create a username!";
		
		if (first.length() > 2 && last.length() > 3) {
			ok += last.toLowerCase().substring(0, 3);
			ok += first.toLowerCase().substring(0, 2);
			return ok;
		} else {
			return not;
		}
		
	}
	
}