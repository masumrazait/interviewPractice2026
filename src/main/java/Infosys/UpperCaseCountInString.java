package Infosys;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "PatnaDelhiKolkataBiharAmnourSARAn";
		int count = 0;
		System.out.print("Uppercase letters: ");
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c+" ");
				count++;
			}
		}
		System.out.println("\nTotal uppercase letters: " + count);
	}
}
