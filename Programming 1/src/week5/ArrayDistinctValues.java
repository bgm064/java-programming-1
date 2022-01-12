package week5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDistinctValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter the number of values: ");
		int val = Integer.parseInt(input.nextLine());

		int[] arr = new int[val];

		for (int i = 0; i < val; i++) {
			System.out.printf("Enter an integer: ");
			arr[i] = Integer.parseInt(input.nextLine());
		}

		Arrays.sort(arr);

		int j = 1;
		String output = "";

		for (int i = 0; j < val; i++) {

			if (i == 0) {
				output += arr[i] + " ";
			}

			if (arr[i] != arr[j]) {
				output += arr[j] + " ";
				;
			}
			j++;
		}

		System.out.printf(output);

	}

}