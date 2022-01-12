package week1;

import java.util.Scanner;

public class AgeAndName {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.print("Enter your age: ");
		int age = input.nextInt();

		System.out.print("Enter your first name: ");
		String firstName = input.next();

		System.out.println(firstName + ", " + age + " years");

	}

}