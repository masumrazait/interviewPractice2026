package SimMasum;

public class GreaterNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 2, 3, 44, 55, 66, 77, 881, 23 };
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > f) {
				s = f;
				f = num;
			} else if (num > s & num != f) {
				s = num;
			}
		}
		System.out.println(s);
	}
}
