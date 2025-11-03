package masum;

public class VowelCount {
	public static void main(String[] args) {
		String input = "dellAmnourBihar";
		String vowel = "AEIOUaieou";
		int count = 1;
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				count++;
				System.out.print(c);
			}
		}
		System.out.println(count);
	}
}
