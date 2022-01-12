package week5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.printf("Enter your hourly wage: ");
		double wage = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.printf("Enter the number of days: ");
		int days = Integer.parseInt(input.nextLine());

		int[] hours = new int[days];

		for (int i = 0; i < days; i++) {
			System.out.printf("Hours worked on day " + (i + 1) + ": ");
			hours[i] = Integer.parseInt(input.nextLine());

		}

		int workHours = 0;
		double grossPay = 0;
		String output = "";

		for (int i = 0; i < hours.length; i++) {
			workHours += hours[i];

			if (hours[i] > 8) {
				grossPay += ((hours[i] - 8) * (wage * 1.5)) + (8 * wage);
			} else {
				grossPay += hours[i] * wage;
			}

			output += hours[i] + " ";
		}

		System.out.println();
		System.out.println("Total work hours is " + workHours);
		System.out.println("Gross pay is " + df.format(grossPay));
		System.out.println("You entered the following daily hours: " + output);

	}

}