package September;

import java.util.Scanner;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word with specctial charecter: ");
		String input = sc.nextLine();
		String sr = input.replaceAll("[^A-Za-z]", "");
		System.out.println(sr);
		sc.close();
	}

}
