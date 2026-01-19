package pwc;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masumraza";
		System.out.print("Non repeated character: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nRepeating characters: ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				System.out.print(d + " ");
			}
		}
	}
}
