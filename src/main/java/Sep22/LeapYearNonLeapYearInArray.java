package Sep22;

public class LeapYearNonLeapYearInArray {
	public static void main(String[] args) {
		int arr[] = { 2001, 2002, 2003, 2005, 2006, 2007, 2009, 2010, 2000, 2004, 2008 };
		for (int year : arr) {
			if ((year % 400 == 0) && (year % 100 != 0) || (year % 4 == 0)) {
				System.out.println("leap year = "+year);
			}else {
				System.out.println("leap non year = "+year);
			}
		}
	}

}
