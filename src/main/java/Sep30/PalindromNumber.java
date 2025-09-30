package Sep30;

public class PalindromNumber {
	public static void main(String[] args) {
		int num = 1122119;
		int rev=0;
		int original = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println(original + " num is palindrome");
		} else {
			System.out.println(original + " num is not a palindrome");
		}
	}
}
