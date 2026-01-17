package TCSMR;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masumraza";
		System.out.print("non repeated character is : ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nrepeated character is : ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				System.out.print(d + " ");
			}
		}
	}
}
