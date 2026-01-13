package TCS;

public class SecondHigherNumInArray {
	public static void main(String[] args) {
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int num = 1; num <= 100; num++) {
			System.out.println(num + " is " + (isPrime(num) ? " prime " : " not prime"));
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
