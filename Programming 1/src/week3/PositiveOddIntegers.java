package week3;

import java.util.*;

public class PositiveOddIntegers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		String str = null;

		try {
			System.out.printf("Enter a positive odd integer: ");
			str = input.nextLine();
			num = Integer.parseInt(str);

			if (num % 2 == 0 || num < 0) {

				System.out.printf("  " + num + " is not a positive odd integer");
				System.out.print("\n");
				System.out.print("\n");
			}

			else {

				System.out.printf("  OK");
				System.out.print("\n");
				System.out.print("\n");
			}

		} catch (NumberFormatException nfe) {
			if (str.equals("quit")) {
				System.out.println("  Bye!");
				return;
			} else {
				System.out.printf("  '" + str + "' is not a positive odd integer");
				System.out.print("\n");
				System.out.print("\n");
			}
		}

		while (true) {
			try {
				System.out.printf("Enter a positive odd integer: ");
				str = input.nextLine();
				num = Integer.parseInt(str);

				if (num % 2 == 0 || num < 0) {

					System.out.printf("  " + num + " is not a positive odd integer");
					System.out.print("\n");
					System.out.print("\n");
				}

				else {

					System.out.printf("  OK");
					System.out.print("\n");
					System.out.print("\n");
				}

			} catch (NumberFormatException nfe) {
				if (str.equals("quit")) {
					System.out.println("  Bye!");
					return;
				} else {
					System.out.printf("  '" + str + "' is not a positive odd integer");
					System.out.print("\n");
					System.out.print("\n");
				}
			}
		}
		
	}
}