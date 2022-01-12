package week9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ObjectsWordList {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter a word (quit ends): ");
		String word = input.nextLine();

		ArrayList<String> wordList = new ArrayList<String>();

		while (!word.equals("quit")) {
			wordList.add(word);
			System.out.printf("Enter a word (quit ends): ");
			word = input.nextLine();
		}

		System.out.println();

		Collections.sort(wordList);

		for (String wordObject : wordList) {
			System.out.println(wordObject);
		}

	}

}