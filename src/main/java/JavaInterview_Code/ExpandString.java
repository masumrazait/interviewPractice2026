package JavaInterview_Code;

public class ExpandString {
	public static void main(String[] args) {
		String str = "a4b3c4";
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			char ch = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));

			for (int j = 1; j <= count; j++) {
				result = result + ch;
			}
		}
		System.out.println(result);
	}
}
