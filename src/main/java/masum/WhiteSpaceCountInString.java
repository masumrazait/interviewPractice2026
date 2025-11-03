package masum;

public class WhiteSpaceCountInString {
	public static void main(String[] args) {
		String str = "public      main";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
