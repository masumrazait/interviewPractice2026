package JavaInterview_Code_Wipro;

public class PrimeNum {

	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		//for(int num:arr) {}
		for (int num=0;num<=100;num++) {
			System.out.println(num + " is " + (isPrime(num) ? "Prime" : "non-Prime"+" "));
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
