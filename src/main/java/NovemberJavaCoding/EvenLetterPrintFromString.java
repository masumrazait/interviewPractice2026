package NovemberJavaCoding;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "Masumrazadelhipatna";
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.println(str.charAt(i));
		}
	}
}
