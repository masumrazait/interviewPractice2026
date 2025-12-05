package Accenture;

public class SecondGreaterNumberInArray {
	public static void main(String[] args) {
		//int arr[]= {11,22,33,44,55,66,77,88};
		for(int num=1;num<=100;num++) {
			System.out.println(num+" is "+(isPrime(num)?" prime number": " not prime"));
		}
	}
	private static boolean isPrime(int num) {
		if(num<1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
