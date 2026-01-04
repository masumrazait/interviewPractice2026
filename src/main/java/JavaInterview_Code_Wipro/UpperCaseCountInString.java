package JavaInterview_Code_Wipro;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String str = "Kma a A AsumR DelhI";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				if (c != ' ') {
					count++;
				}
				System.out.println("Upper Letter is: " + c);
			}
		}
		System.out.println("UpperLetter Count is : " + count);
	}

}
