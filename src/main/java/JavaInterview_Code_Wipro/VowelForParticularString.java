package JavaInterview_Code_Wipro;

public class VowelForParticularString {

	public static void main(String[] args) {
		String str = "generaAted method stub";
		String vowel = "aeiouAEIOU";
		System.out.print("vowel is present in given string: ");
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				if (c != ' ') {
					System.out.print(c + " ");
				}
			}
		}
	}
}
