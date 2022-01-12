package week4;

import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		MethodsLibrary mL = new MethodsLibrary();
		
		System.out.printf("Enter an integer: ");
		int j = input.nextInt();
		
		System.out.printf(j + "! = " + mL.factorial(1, 1, j));
		
	}

}

class MethodsLibrary {

	static int factorial(int i, int f, int j) {

		
		for (i = 1; i <= j; i++) {
			f = f * i;
		}

		return f;
	}

}