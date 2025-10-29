package NovJava;

public class StringWOrdCount {
	public static void main(String[] args) {
		String str = "Run and Debug java program online Write your code in java java this editor and press"
				.toLowerCase();
		int count = 1;
		System.out.print("Total word count is : ");
		for (int i = 0; i <= str.length() - 1; i++) {
			if ((str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
