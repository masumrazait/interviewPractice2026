package September;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		String input = "masumraza";
		for (int i = 1; i <= input.length() - 1; i += 2) {
			System.out.println(input.charAt(i));
		}
	}
}
