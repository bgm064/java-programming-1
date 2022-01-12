package week6;

import java.util.Scanner;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter username: ");
		String name = input.nextLine();

		String email = "@myy[.]haaga-helia[.]fi";

		if (name.matches("a[0-9]{7}" + email)) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid username format");
		}

	}

}