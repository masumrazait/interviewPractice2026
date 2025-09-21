package September;

public class Ren {

	public static void main(String[] arg) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int num : arr) {
			System.out.println(num + " is " + (isPrime(num) ? "Prime Num" : "non-prime-num"));
		}
	}

	private static Boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % 2 == 0)
				return false;

		}
		return true;
	}
}
