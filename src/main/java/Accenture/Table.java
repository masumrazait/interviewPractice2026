package Accenture;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = sc.nextInt();
		System.out.println("*************** Table of " + num + " ***********");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + num * i);
		}
	}
}