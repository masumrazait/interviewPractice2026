package Oct25;

public class SecondHigherNum {
	public static void main(String[] args) {
		//int arr[] = { 11, 22, 33, 44 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num =0;num<=10;num++) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > first && num != second) {
				num = second;
			}
		}
		System.out.println(second);
	}

}
