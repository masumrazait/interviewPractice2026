package March;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "masumraza delhi";
		for (int i = 1; i <= str.length() - 1; i++) {
			if (i % 2 == 0) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}
}
