package October;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		String str = "deljipatna";
		for (int i = 1; i <= str.length() - 1; i += +2) {
			System.out.print(str.charAt(i) + " ");
		}
	}
}
