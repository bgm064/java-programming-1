package week6;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter username: ");
		String un = input.nextLine();

		System.out.printf("Enter password: ");
		String pw = input.nextLine();

		System.out.printf(validatePassword(un, pw));

	}

	public static String validatePassword(String un, String pw) {
		String x = "OK";
		String y = "NOT OK";

		if (pw.length() < 8 || pw.contains(un.toLowerCase())) {
			return y;
		} else {
			return x;
		}
		
	}

}