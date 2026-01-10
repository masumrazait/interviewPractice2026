package Coforge;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "MasUmRaZaDeLhi";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
				System.out.print(c + " ");
			}
		}
		System.out.println(count);
	}
}
