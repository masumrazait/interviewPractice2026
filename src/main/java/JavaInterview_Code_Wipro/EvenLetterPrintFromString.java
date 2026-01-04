package JavaInterview_Code_Wipro;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		String str = "masum";
		for (int i = 1; i < str.length() - 1; i += 2) {
			System.out.println(str.charAt(i));
		}
	}

}
