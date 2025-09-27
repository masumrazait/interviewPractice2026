package October;

public class PrimeNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11 };
		for (int num : arr) {
			System.out.println(num + " is " + (isPrime(num) ? "PrimeNum" : "Non PrimeNum" + " "));
		}
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}