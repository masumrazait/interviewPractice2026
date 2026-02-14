package january;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "patnabiharamnoursarandelhi";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.println("repeat : ");
		for (char d : str.toCharArray()) {
			String temp = "";
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				temp += str;
				System.out.print(d + " ");
			}
		}
	}
}
