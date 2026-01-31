package synechron_Java;

public class VOwelCOuntConsonantCount {
	public static void main(String[] args) {
		String str = "umbresllaRADg";
		String vowel = "aeiouAEIOU";
		int vcount = 0;
		int ccount = 0;
		System.out.print("vowel letter is : ");
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				vcount++;
				System.out.print(c + " ");
			} else {
				ccount++;
			}
		}
		System.out.println("\nvowel count is : " + vcount);
		System.out.println("consonant count is : " + ccount);
	}
}
