package JavaInterview_Code_Wipro;

public class LeapYearNonLeapYearInArray {
	public static void main(String[] args) {
		int arr[] = { 2022, 2015, 2016, 2014, 2024, 2030, 2028 };
		for (int year : arr) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("leap year: " + year);
			} else {
				System.out.println("not leap year: " + year);
			}
		}
	}
}
