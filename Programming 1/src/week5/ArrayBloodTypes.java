package week5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");

		String[] bloodTypeArray = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		System.out.printf("Enter blood type: ");
		String bloodType = input.nextLine();

		double total = bloodTypeArray.length;
		double counter = 0;

		for (int i = 0; i < total; i++) {

			if (bloodTypeArray[i].contains(bloodType)) {

				counter++;

			}

		}

		double percent = (counter / total) * 100;
		System.out.println(df.format(percent) + ",0 %");
		
	}

}