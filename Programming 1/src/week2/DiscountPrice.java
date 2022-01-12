package week2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.printf("Enter original price: ");
		double price = 100.0 * input.nextDouble();

		System.out.printf("Enter discount percentage: ");
		double discount = (100.0 - input.nextDouble()) / 100.0;

		double sum = (discount * price) / 100.0;

		System.out.print("\n" + "The final price is " + (df.format(Math.round(sum * 100.0) / 100.0)));

	}

}
