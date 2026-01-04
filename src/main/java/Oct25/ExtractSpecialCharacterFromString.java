package Oct25;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "m%a@h()i!#D24(o((@#72N21I";
		String rm = str.replaceAll("[^A-Za-z]", "").toLowerCase();
		System.out.println(rm);
	}
}
