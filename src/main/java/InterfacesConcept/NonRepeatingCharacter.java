package InterfacesConcept;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "Auto generated method stub";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.print(c);
			}
		}
	}
}
