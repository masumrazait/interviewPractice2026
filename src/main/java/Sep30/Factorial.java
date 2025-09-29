package Sep30;

import java.util.*;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		long f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println(f);
	}
}
