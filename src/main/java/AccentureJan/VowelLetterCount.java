package AccentureJan;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "umbrella";
		String vowel = "aeiou";
		int count = 0;
		System.out.print("vowel letter : ");
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.print(c);
			}
		}
		System.out.println("\ntotal count is : " + count);
	}
}
