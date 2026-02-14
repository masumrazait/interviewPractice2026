package Sep22;

import java.util.Scanner;

public class ReplaceWhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the chacters: ");
		String str = sc.nextLine();
		String replaced = str.replaceAll("[^A-Za-z]", "");
		System.out.println(replaced.toLowerCase());
		System.out.println(replaced);
		sc.close();
	}

}
