package September;

import java.util.Scanner;

public class CheckNumberIsLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		System.out.println("enter the year: ");
		int year = Input.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 4 == 0)) {
			System.out.println(year + " year is leap year");
		} else {
			System.out.println(year + " year is not a leap year");
		}
		Input.close();
	}
}
