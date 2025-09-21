package InterfacesConcept;

interface Interface {
	int i = 10;

	void display();

}

abstract class Dev implements Interface {

}

class Test extends Dev {
	@Override
	public void display() {
		System.out.println("Display method from Interface");
	}

	public static void main(String arg[]) {
		System.out.println("Interface variable i = " + i);
		Test obj = new Test();
		obj.display();
	}
}
