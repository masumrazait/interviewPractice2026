package abstract_concept;

public class PalindromNumber {
	public static void main(String[] args) {
		int num = 234221;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.print(rev);
	}
}
