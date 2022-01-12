package week5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] arr = new double[4];

		for (int i = 0; i < arr.length; i++) {

			System.out.printf("Enter " + (i + 1) + ". number: ");
			arr[i] = readDouble(input);

		}

		Arrays.sort(arr);
		
		for (int i = 3; i > -1; i--) {
			System.out.printf(arr[i] + " ");
		}

	}
	
	private static double readDouble(Scanner input) {
		return Double.parseDouble(input.nextLine().replace(',', '.'));
	}

}