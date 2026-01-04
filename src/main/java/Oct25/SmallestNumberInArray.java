package Oct25;

public class SmallestNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 4,1, 21, 111, 22, 33, 44, 56, 6, 15, 34, 53 };
		int f = Integer.MAX_VALUE;
		int s = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num < f) {
				s = f;
				f = num;
			} else if (num < s && num != f) {
				s = num;
			}
		}
		System.out.println("second smallest number: " + s);
	}
}
