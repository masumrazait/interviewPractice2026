package Infosys;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "amnoursaranbihar";
		System.out.print("Non Repeating Character is : ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nRepeating Character is = ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				System.out.print(d + " ");
			}
		}
	}
}
