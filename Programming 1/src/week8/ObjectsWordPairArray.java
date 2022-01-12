package week8;

import java.util.ArrayList;

public class ObjectsWordPairArray {

	public static void main(String[] args) {

		WordPair first = new WordPair("class", "luokka");
		WordPair second = new WordPair("object", "olio");
		WordPair third = new WordPair("variable", "muuttuja");
		
		ArrayList<WordPair> wordList = new ArrayList<WordPair>();
		
		wordList.add(first);
		wordList.add(second);
		wordList.add(third);
		
		for (WordPair wordListObject : wordList) {
			System.out.println(wordListObject.getEnglishWord() + " = " + wordListObject.getFinnishWord());
		}

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

