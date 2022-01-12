package week6;

import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.printf("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println(reverse(str));
		
	}

	public static String reverse(String x) {
		String y = "";
		for (int i = x.length() - 1; i >= 0; i--) {
			y += x.charAt(i);
		}
		return y;
	}
	
}