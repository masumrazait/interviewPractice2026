package InterfacesConcept;

//Interface
interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

//Goat "implements" the Animal interface
class Goat implements Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The goat says: mey mey");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

class Main {
	public static void main(String[] args) {
		Goat myGoat = new Goat(); // Create a goat object
		myGoat.animalSound();
		myGoat.sleep();
	}
}