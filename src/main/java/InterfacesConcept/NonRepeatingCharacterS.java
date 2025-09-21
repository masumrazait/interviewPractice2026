package InterfacesConcept;

public class NonRepeatingCharacterS {

	public static void main(String[] args) {
		String str = "my name is www del patna bihar";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.println(c);
			}
		}
	}
}
