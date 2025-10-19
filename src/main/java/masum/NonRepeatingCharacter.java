package masum;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masumraza";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) != (str.lastIndexOf(c))) {
				System.out.println("reapting character: " + c);
			}
		}
		System.out.println(" ***************************************** ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) == (str.lastIndexOf(d))) {
				System.out.println("non repeating charecter: " + d);
			}
		}
	}
}
