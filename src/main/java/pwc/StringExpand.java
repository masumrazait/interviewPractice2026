package pwc;

public class StringExpand {
	public static void main(String[] args) {
		String str = "a3b6p6t8";
		String result = "";
		for (int i = 0; i < str.length() - 1; i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 1; j <= count; j++) {
				result = result + c + " ";
			}
		}
		System.out.println(result);
	}
}
