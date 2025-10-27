package NovJava;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "!@#M@#A)(*s*&u#$7455m";
		String newStr = str.replaceAll("[^A-Za-z]", "");
		System.out.println(newStr);
	}
}
