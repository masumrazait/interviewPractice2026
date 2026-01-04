package JavaInterview_Code_Wipro;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your the number: ");
		int num = sc.nextInt();
		int rev = 0;
		int original = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println("num is palindrome: " + original);
		} else {
			System.out.println("num is not palindrome: " + rev);
		}
		sc.close();
	}
}
