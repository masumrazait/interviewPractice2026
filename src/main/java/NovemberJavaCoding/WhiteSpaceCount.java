package NovemberJavaCoding;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "R                   a".toLowerCase();
		int count = 0;
		System.out.print("Total white space count is : ");
		for (int i = 0; i <= str.length() - 1; i++) {
			if ((str.charAt(i) == ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
