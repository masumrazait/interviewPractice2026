package Sept21;

public class UpperCaseCountInString {
	public static void main(String args[]) {
		String str = "masuMrR";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);
	}
}
