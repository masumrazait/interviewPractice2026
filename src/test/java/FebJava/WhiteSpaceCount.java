package FebJava;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "ma          m";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total white space: " + count);
	}
}
