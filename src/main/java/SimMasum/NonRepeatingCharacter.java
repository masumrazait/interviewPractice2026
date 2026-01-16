package SimMasum;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masumraza";
		System.out.print("repeating characters: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}

		System.out.print("\nnon repeating character: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
	}
}
