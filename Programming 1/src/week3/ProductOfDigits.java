package week3;

import java.util.*;

public class ProductOfDigits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		int product = 1;


		System.out.printf("Enter an integer: ");
		num = input.nextInt();

		if (num == 0) {
			System.out.print(num + "\n");
		} 
		
		else {

			while (num != 0) {

				product = product * (num % 10);

				num = num / 10;
			}
			System.out.print(Math.abs(product) + "\n");
		}
	}

}