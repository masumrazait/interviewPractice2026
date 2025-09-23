package Sep22;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "masum";
		System.out.print("non repeating character is: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\n" + "repeating character is: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) != (str.lastIndexOf(c))) {
				System.out.print(c + " ");
			}
		}
	}

}
