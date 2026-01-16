package SimMasum;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "mAsUmRaZa";
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c);
			}
		}
	}
}
