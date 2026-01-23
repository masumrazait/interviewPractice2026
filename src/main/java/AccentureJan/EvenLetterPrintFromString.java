package AccentureJan;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "EvenLetterPrintFromString";
		int count = 0;
		System.out.print("prime letter in given character is: ");
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.print(str.charAt(i) + " ");
			count++;
		}
		System.out.println("\nTotal count is " + count);
	}

}
