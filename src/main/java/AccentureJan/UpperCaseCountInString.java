package AccentureJan;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "UpperCaseCountInString";
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println("Upper case letter is : "+c);
			}
		}
	}

}
