package DecemberJava;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "amnoursaranbihar";
		System.out.print("Non-repeated character is : ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nRepeated character is : ");
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				System.out.print(d + " ");
			}
		}
	}
}
