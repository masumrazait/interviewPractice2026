package SimMasum;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "rajuiUmbrela";
		String vowel = "AEIOUaeiou";
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.print(c);
			}
		}
	}
}
