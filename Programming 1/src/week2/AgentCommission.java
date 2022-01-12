package week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.printf("Enter selling price: ");
		double price = input.nextDouble();

		double comm = price * 0.0344;

		if (comm < 2400) {
			System.out.println("\n" + "The commission is " + "2400,00 euros.");
		} else {
			System.out.println("\n" + "The commission is " + df.format(comm) + " euros.");
		}

	}
}