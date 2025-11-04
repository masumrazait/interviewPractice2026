package Infosys;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "hell      aa ad ddsa ddd dd";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Total white space count is : " + count);
		int wordCount = 0;
		// WordCount
		for (int j = 0; j <= str.length() - 1; j++) {
			if (str.charAt(j) == ' ' && str.charAt(j + 1) != ' ') {
				wordCount++;
			}
		}
		System.out.println("Total word Count is : " + wordCount);
	}
}
