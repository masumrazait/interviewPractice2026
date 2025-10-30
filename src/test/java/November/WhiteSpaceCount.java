package November;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "Write         your";
		int count = 0;
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Total white space count : " + count);
	}
}
