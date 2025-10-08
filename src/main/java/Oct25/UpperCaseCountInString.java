package Oct25;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "ABCDEFGHIJKLM";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
