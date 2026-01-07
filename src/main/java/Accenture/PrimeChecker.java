package Accenture;

public class PrimeChecker {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 11, 33, 2424, 44 };
		for (int num : arr) {
			System.out.println(num + " is prime " + (isPrime(num) ? " prime " : " non prime"));
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
