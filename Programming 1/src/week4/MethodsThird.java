package week4;

import java.util.Locale;
import java.util.Scanner;

public class MethodsThird {
	
	static double calculateNetSalary(double g, double t, double s) {
		
		s = g - (g * (t / 100));
		return s;
		
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in).useLocale(Locale.GERMANY);;
		
		double g, t, s = 0;
		
		System.out.printf("Enter gross salary: ");
		g = input.nextDouble();
		
		System.out.printf("Enter income tax rate: ");
		t = input.nextDouble();
		
		System.out.printf("\n" + "The net salary is " + "%.2f", calculateNetSalary(g, t, s));
		
		
	}
	
}