package masum;

public class PalindromeNumberChecker {
	public static void main(String[] args) {
		int num = 123454321	;
		int rev = 0;
		int original = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println(original + " num is palindrom");
		} else {
			System.out.println(original + " num is not palidrom");
		}
	}
}
