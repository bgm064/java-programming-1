package week7;

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter password: ");
		String pswd = input.nextLine();
		
		System.out.println(checkStrength(pswd));
		
	}

	public static String checkStrength(String pswd) {
		
		String a = "OK", b = "Not strong enough!", output = "";
		int upper = 0, lower = 0, digit = 0, other = 0;
		
		if (pswd.length() >= 8) {
			if (pswd.matches(".{0,}[a-z].{0,}")) {
				lower++;
			}
			if (pswd.matches(".{0,}[A-Z].{0,}")) {
				upper++;
			}
			if (pswd.matches(".{0,}[0-9].{0,}")) {
				digit++;
			}
			if (pswd.matches(".{0,}[^a-zA-Z0-9].{0,}")) {
				other++;
			}
			if (upper + lower + digit + other >= 3) {
				output = a;
			} else {
				output = b;
			}
		} else {
			output = b;
		}
		return output;
	}
	
}