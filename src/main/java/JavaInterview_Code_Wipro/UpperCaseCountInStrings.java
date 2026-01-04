package JavaInterview_Code_Wipro;

public class UpperCaseCountInStrings {
	public static void main(String[] args) {
		String input = "MaDhUBani";
		for (int i = 0; i <= input.length()-1; i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.print(c+" ");
			}
		}
	}
}
