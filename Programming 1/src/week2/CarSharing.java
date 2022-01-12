package week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		
		System.out.printf("Enter driven kilometers: ");
		int km = input.nextInt();

		System.out.printf("Enter fuel consumption per 100 km: ");
		double fuelCon = input.nextDouble();

		System.out.printf("Enter fuel price per liter: ");
		double fuelPri = input.nextDouble();

		System.out.printf("Enter number of people: ");
		int ppl = input.nextInt();

		
		double sum = km * fuelCon / 100.0 * fuelPri / ppl;
		System.out.printf("Each of the " + ppl + " people should pay " + (df.format(sum)) + " euros.");

	}

}
