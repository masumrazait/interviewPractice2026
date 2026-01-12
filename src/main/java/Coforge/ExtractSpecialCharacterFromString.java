package Coforge;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "mas@#134MDs!$!mas443";
		String rep = str.replaceAll("[^A-Za-z]", "");
		System.out.println(rep);
	}
}
