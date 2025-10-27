package NovJava;

public class PalindromNumber {
	public static void main(String[] args) {
		int rev = 0;
		int num = 1234321;
		int original = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println(original + " is palindrom");
		} else {
			System.out.println(original + " is non palindrom");
		}
	}
}
