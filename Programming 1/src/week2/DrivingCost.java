package week2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.printf("Enter driven kilometers: ");
		int km = input.nextInt();

		System.out.printf("Enter amount of fuel consumed: ");
		double fuel = input.nextDouble();

		System.out.printf("Enter fuel price per liter: ");
		double price = input.nextDouble();
		
		double cost = (price * fuel) / km;
		
		System.out.print("\n" + "The cost per kilometer is " + (df.format(cost)) + " euros.");
	}

}
