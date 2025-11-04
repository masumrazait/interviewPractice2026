package September;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = Input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " this is even number ");
		} else {
			System.out.println(num + " this is odd number");
		}
		Input.close();
	}

}
