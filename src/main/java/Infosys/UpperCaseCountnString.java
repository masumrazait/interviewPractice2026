package Infosys;

public class UpperCaseCountnString {
	public static void main(String[] args) {
		String str = "MASumRaZa";
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c + " ");
			}
		}
	}
}
