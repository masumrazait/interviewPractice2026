package Tests;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "VowelLetterCount";
		String vowel = "AEIOUaeiou";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.print(c + " ");
				count++;
			}
		}
		System.out.println(count);
	}
}
