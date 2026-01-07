package DecemberJava;

public class SecondHigherNumInArray {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 11, 23, 5, 2, 34, 53, 24, 42, 3553, 24, 234, 232 };
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > f) {
				s = f;
				f = num;
			} else if (num > s && num != f) {
				s = num;
			}
		}
		System.out.println(s);
	}
}
