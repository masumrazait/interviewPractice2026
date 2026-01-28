package abstract_concept;

public class FactorialNumbers {
	public static void main(String[] args) {
		int num = 6;
		long f = 1;
		for (int i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println(num + " is " + f);
	}
}
