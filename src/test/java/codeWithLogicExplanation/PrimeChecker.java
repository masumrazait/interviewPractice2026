package codeWithLogicExplanation;

public class PrimeChecker {

	public static void main(String[] args) {
		// Loop through numbers from 1 to 100
		for (int num = 1; num <= 100; num++) {
			// Call isPrime() and print result using ternary operator
			System.out.println(num + " is " + (isPrime(num) ? "Prime" : "Not Prime"));
		}
	}

	// Method to check if a number is prime
	private static boolean isPrime(int num) {

		// Prime numbers are greater than 1
		if (num <= 1)
			return false;

		// Check divisibility from 2 up to sqrt(num)
		// If divisible by any number in this range, it's not prime
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		// If no divisors found, it's prime
		return true;
	}
}