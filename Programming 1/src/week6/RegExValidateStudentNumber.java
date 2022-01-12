package week6;

import java.util.Scanner;

public class RegExValidateStudentNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter student number: ");
		String student = input.nextLine();

		if (student.matches("[0-9]{7}")) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
		}
		
	}
	
}