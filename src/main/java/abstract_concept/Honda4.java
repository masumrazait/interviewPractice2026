package abstract_concept;

abstract class Honda4 {
	abstract void run();
}

class Bike extends Honda4 {
	void run() {
		System.out.println("running safely");
	}

	public static void main(String args[]) {
		Honda4 obj = new Bike();
		obj.run();
	}
}