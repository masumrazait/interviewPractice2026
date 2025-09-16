package September;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int n1 = 0, n2 = 1, sum;
		for (int i = 2; i <= num; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
		}

	}

}
