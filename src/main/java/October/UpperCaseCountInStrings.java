package October;

public class UpperCaseCountInStrings {
	public static void main(String[] args) {
		String str = "MasuMeRazA";
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.println(c);
			}
		}
	}
}
