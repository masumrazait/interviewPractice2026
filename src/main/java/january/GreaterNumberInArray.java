package january;

public class GreaterNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 4, 55, 554, 323 };
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > f) {
				s = f;
				f = num;
			} else if (num > s && num != s) {
				s = num;
			}
		}
		System.out.println(s);
	}
}
