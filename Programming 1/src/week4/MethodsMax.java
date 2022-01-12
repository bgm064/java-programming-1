package week4;

import java.util.Locale;
import java.util.Scanner;

public class MethodsMax {

	static double max(double f, double s) {
		
		if (f > s) {
			return f;
		} else {
			return s;
		}
		
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double f, s;
		
		System.out.printf("Enter first double: ");
		f = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.printf("Enter second double: ");
		s = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.printf("\n" + "The max value is " + max(f, s));
		
	}
	
}