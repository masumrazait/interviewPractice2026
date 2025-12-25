package Accenture;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "N%&$A1323G*3(#AR((34AJ534AN";
		String s2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(s2);
	}
}
