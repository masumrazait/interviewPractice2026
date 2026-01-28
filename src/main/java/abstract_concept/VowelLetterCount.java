package abstract_concept;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "umbrella";
		String vowel = "AEOUIaeiou";
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.print(c + " ");
			}
		}
	}
}
