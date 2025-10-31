package NovemberJavaCoding;

public class ReverseLastWordSimple {
	public static void main(String[] args) {
		// Split → Loop → Check → Reverse → Join → Print
		String str = "laptop is name ideapad dell hp";
		String[] words = str.split(" ");
		String result = "";

		for (int i = 0; i < words.length; i++) {
			if (i >= words.length - 2) {
				String rev = "";
				for (int j = words[i].length() - 1; j >= 0; j--) {
					rev += words[i].charAt(j);
				}
				result += rev + " ";
			} else {
				result += words[i] + " ";
			}
		}
		System.out.println(result.trim());
	}
}
