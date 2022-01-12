package week3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat dec = new DecimalFormat("0.00");
		
		double deposit, interestRate, capitalTax;
		int years;
		
		System.out.print("Enter initial deposit: ");
		deposit = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter interest rate: ");
		interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter capital income tax rate: ");
		capitalTax = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter number of years: ");
		years = Integer.parseInt(input.nextLine());
		
		
		for (int i = 1; i <= years; i++) {
			double ir = (deposit/100) * interestRate;
			double citr = (ir / 100) * capitalTax;

			double amount = deposit + ir - citr; 
			
			System.out.println(i + ": " + dec.format(amount));
			deposit = amount;
			
		}

	}

}