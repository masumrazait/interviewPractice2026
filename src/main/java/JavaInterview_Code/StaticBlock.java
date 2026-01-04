package JavaInterview_Code;

public class StaticBlock {
	static {
		System.out.println("Static block1");
	}
	static {
		System.out.println("Static block2");
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}
}
