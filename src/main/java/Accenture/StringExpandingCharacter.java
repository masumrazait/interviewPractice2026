package Accenture;

public class StringExpandingCharacter {
	public static void main(String[] args) {
		String str = "d3g4h5d4a3";
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 1; j <= count; j++) {
				result = result + c;
			}
		}
		System.out.println(result);
	}
}
