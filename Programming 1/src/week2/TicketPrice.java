package week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.printf("Enter price for a single ticket: ");
		double single = input.nextDouble();

		System.out.printf("Enter price for a season ticket: ");
		double season = input.nextDouble();

		System.out.printf("Enter the number of bus trips per month: ");
		int trips = input.nextInt();

		double price = single * trips;

		if (price < season) {
			System.out.println("\n" + "Buying single tickets is " + (df.format(season - price)) + " euros cheaper.");
		} else if (price == season) {
			System.out.println("\n" + "There is no difference in the price.");
		} else {
			System.out.println("\n" + "Buying a season ticket is " + (df.format(price - season)) + " euros cheaper.");
		}

	}

}