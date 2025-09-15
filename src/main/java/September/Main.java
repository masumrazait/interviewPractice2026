package September;

// Abstract class
abstract class Vehicle {
	abstract void start(); // abstract method

	void wheels() { // concrete method
		System.out.println("Vehicle has wheels");
	}
}

// Interface
interface Engine {
	void start(); // abstract method (public by default)
}

// Child class
class Car extends Vehicle implements Engine {
	@Override
	public void start() { // Must be public
		System.out.println("Car started");
	}
}

// Main class
public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		c.start(); // Car started
		c.wheels(); // Vehicle has wheels
	}
}
