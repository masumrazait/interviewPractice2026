package October;

public class ABC {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10 };
		for (int num : arr) {
			System.out.println(num + " is " + (isPrime(num) ? "prime" : "non-prime"));
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
