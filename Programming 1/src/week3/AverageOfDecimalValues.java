package week3;

import java.text.DecimalFormat;
import java.util.*;

public class AverageOfDecimalValues {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		List<Integer> list = new ArrayList<>();
		ArrayList<Double> arrayList = new ArrayList<Double>();

		double first = 0;
		double next = 0;

		System.out.printf("Enter first number (zero ends): ");
		first = input.nextDouble();
		arrayList.add(first);

		if (first == 0) {
			System.out.printf("Nothing to calculate");
			return;

		} else {
			System.out.printf("Enter next number (zero ends): ");
			next = input.nextDouble();
			list.add(1);
			arrayList.add(next);

		}

		while ((next > 0) || (next < 0)) {
			System.out.printf("Enter next number (zero ends): ");
			next = input.nextDouble();
			list.add(1);
			arrayList.add(next);

		}

		int arr = 0;
		for (int i = 0; i < list.size(); i++)
			arr += list.get(i);

		double sum = 0;
		for (int n = 0; n < arrayList.size(); n++)
			sum += arrayList.get(n);

		double avg = sum / arr;

		if (next == 0) {
			input.close();
			System.out.printf("The average is " + df.format(avg));
		}
	}
}