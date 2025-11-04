package September;

import java.util.*;

public class PalindromNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();
		int orignal = num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orignal == rev) {
			System.out.println("num is palindrom: " + orignal);
		} else {
			System.out.println("num is not palindrom: " + rev);
		}
		sc.close();
	}
}
