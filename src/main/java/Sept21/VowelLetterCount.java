package Sept21;

public class VowelLetterCount {

	public static void main(String[] args) {
		String str = "Auto generated method stub";
		String vowel = "aeiouAEIOU";
		int count = 1;
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);
	}
}
