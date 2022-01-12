package week5;

import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] eng = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] fin = { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja" };

		System.out.printf("Enter an English word: ");
		String str = input.nextLine();
		int counter = 0;

		for (int i = 0; i < eng.length; i++) {
			if (eng[i].contains(str)) {
				System.out.printf(fin[i]);
				counter++;
			}
		}

		if (counter == 0) {
			System.out.printf("Unknown word");
			
		}
	}

}