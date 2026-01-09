package Coforge;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masum";
		System.out.print("Non Repeating character : ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nRepeating character: ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				System.out.print(d + " ");
			}
		}
	}
}
