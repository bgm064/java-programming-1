package week1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DecimalPlaces {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter a decimal number: ");
		double decimalNumber = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print(twoDecimals.format(decimalNumber));
	}

}