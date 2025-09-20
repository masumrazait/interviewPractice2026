package September;

public class VowelCount {
	public static void main(String[] args) {

		String str = "masumraza";
		String vowel = "aeiouAEIOU";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.println(c);
				count++;

			}
		}
		System.out.println(count);
	}

}
