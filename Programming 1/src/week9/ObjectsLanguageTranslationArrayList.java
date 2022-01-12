package week9;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsLanguageTranslationArrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<WordPair> wordList = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");

		System.out.printf("Enter an English word: ");
		String english = input.nextLine();
		
		if (!"ok".contentEquals(english)) {
			System.out.printf("Enter a Finnish word: ");
			String finnish = input.nextLine();
			
			WordPair wordPair = new WordPair(english, finnish);
			wordList.add(wordPair);
		}
		
		System.out.println();

		while (!"ok".contentEquals(english)) {
			System.out.printf("Enter an English word: ");
			english = input.nextLine();
			if (!"ok".contentEquals(english)) {
				System.out.printf("Enter a Finnish word: ");
				String finnish = input.nextLine();

				WordPair wordPair = new WordPair(english, finnish);

				wordList.add(wordPair);
			}
			
			System.out.println();
			
		}

		System.out.println("=== English-Finnish translation service (quit ends) ===");

		System.out.printf("Enter an English word: ");
		english = input.nextLine();
		int counter = 0;

		while (!"quit".contentEquals(english)) {
			for (int i = 0; i < wordList.size(); i++) {
				if (english.contains(wordList.get(i).getEnglishWord())) {
					System.out.println(wordList.get(i).getFinnishWord());
					System.out.println();
				} else {
					counter++;
				}
			}

			if (counter >= wordList.size()) {
				System.out.println("Unknown word");
				System.out.println();
			}
			
			System.out.printf("Enter an English word: ");
			english = input.nextLine();
		}
		
		System.out.printf("Bye!");
		input.close();
	}
}

class WordPair {

	private String englishWord;
	private String finnishWord;
	
	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}
	
	public String getEnglishWord() {
		return englishWord;
	}
	
	public String getFinnishWord() {
		return finnishWord;
	}
	
}