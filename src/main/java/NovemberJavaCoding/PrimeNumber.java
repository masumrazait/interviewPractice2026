package NovemberJavaCoding;

public class PrimeNumber {
	public static void main(String[] args) {
		//int arr[] = { 25, 568, 584, 26, 45, 85 };
		for (int num=1;num<=100;num++) {
			System.out.println(num + " " + (isPrime(num) ? "isPrime number" : "non prime num"));
		}
	}

	private static boolean isPrime(int num) {
		if (num <=1)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}