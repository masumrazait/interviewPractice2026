package Accenture;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: = ");
		int first = sc.nextInt();
		System.out.println("Enter the Second number: = ");
		int second = sc.nextInt();
		int sub = first - second;
		System.out.println(first + " - " + second + " = " + sub);
		sc.close();
	}
}
