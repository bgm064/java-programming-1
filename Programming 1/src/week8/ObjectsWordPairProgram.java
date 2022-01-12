package week8;

public class ObjectsWordPairProgram {

	public static void main(String[] args) {
		
		WordPair first = new WordPair("class", "luokka");
		WordPair second = new WordPair("object", "olio");
		WordPair third = new WordPair("variable", "muuttuja");
		
		System.out.println(first.getEnglishWord() + " = " + first.getFinnishWord());
		System.out.println(second.getEnglishWord() + " = " + second.getFinnishWord());
		System.out.println(third.getEnglishWord() + " = " + third.getFinnishWord());

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