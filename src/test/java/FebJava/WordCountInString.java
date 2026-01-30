package FebJava;

public class WordCountInString {
	public static void main(String[] args) {
		String str = "delhi           patna bihar      amounr sartan";
		int count = 1;
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println("word count is : " + count);
	}

}
