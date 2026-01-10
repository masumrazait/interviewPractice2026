package Coforge;

public class StringExpand {
	public static void main(String[] args) {
		String str = "a2v3b4";
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 0; j <= count; j++) {
				result = result + c;
			}
		}
		System.out.println(result);
	}
}
