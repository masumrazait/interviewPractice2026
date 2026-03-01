package November;

public class ThisKeyword {
	static int i = 10;

	public ThisKeyword() {
		int i = 29;
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		int i = 29;
		System.out.println(i);
	}
}
