package Coforge;

public class PrimeChecker {
	public static void main(String[] args) {
		for (int num = 1; num <= 100; num++) {
			System.out.println(num + " is " + (isPrime(num) ? " prime number" : "not prime num"));
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
