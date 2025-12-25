package Accenture;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "DEHIde";
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.println(str.charAt(i));
		}
	}
}
