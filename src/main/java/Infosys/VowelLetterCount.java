package Infosys;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "MasumRaziSi";
		String vowel = "AEIOUaieou";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.print(c + " ");
				count++;
			}
		}
		System.out.println("\nTotla number of vowel: " + count);
	}
}
