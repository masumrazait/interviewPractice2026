package synechron_Java;

public class UpperCaseCountInString {
	public static void main(String[] args) {
		String str = "maSuMSiMIrAN";
		int count = 0;
		System.out.print("Upper Character is : ");
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c + " ");
				count++;
			}
		}
		System.out.println("\nTotal count: " + count);
	}
}
