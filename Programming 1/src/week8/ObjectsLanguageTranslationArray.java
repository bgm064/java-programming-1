package week8;

import java.util.Scanner;

public class ObjectsLanguageTranslationArray {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		WordPair[] wordArray = new WordPair[5];

		wordArray[0] = new WordPair("bird", "lintu");
		wordArray[1] = new WordPair("bus", "bussi");
		wordArray[2] = new WordPair("car", "auto");
		wordArray[3] = new WordPair("cat", "kissa");
		wordArray[4] = new WordPair("dog", "koira");

		System.out.printf("Enter an English word: ");
		String word = input.nextLine();

		for (int i = 0; i < wordArray.length; i++) {
			if (word.equals(wordArray[i].getEnglishWord())) {
				System.out.printf(wordArray[i].getFinnishWord());
				return;
			}
		}
		System.out.println("Unknown word");
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