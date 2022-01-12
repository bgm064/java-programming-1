package week1;

import java.util.Scanner;

public class GreetingProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Hello, " + firstName + "!");
	}

}

