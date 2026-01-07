package Infosys;

public class SecondGreaterNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 11, 2, 33, 44, 566, 73, 55, 65, 34, 65, 34, 34, 72, 13, 134, 546, 54 };
		for (int num : arr) {
			System.out.println(num + " isPrime " + (isPrime(num) ? "prime" : " not prime"));
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;

		}
		return true;
	}
}
