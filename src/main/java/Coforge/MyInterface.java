package Coforge;

public interface MyInterface {
	static void show() {
		System.out.println("running the class");
	}

	public static void main(String[] args) {
		MyInterface.show();
	}
}
