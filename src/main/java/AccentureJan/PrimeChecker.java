package AccentureJan;

public class PrimeChecker {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 44, 53, 23, 23, 53, 533, 43, 145, 53, 131, 53, 52, 131, 424, 523, 113, 532, 757 };
		for (int num : arr) {
			System.out.println(num+" is "+(isPrime(num)?"prime":"not prime"));
		}
	}
	private static boolean isPrime(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
