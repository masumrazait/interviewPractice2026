package abstract_concept;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "MaDhUBani";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c + " ");
				count++;
			}
		}
		System.out.println(count);
	}
}
