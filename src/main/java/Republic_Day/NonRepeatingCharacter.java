package Republic_Day;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "aabbbbcdeaAA";
		System.out.print("Non repeating character is: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
		System.out.print("\nRepeating character is: ");
		String temp = "";
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				if (temp.indexOf(d) == -1) {
					temp = temp + d;
					System.out.print(d + " ");
				}
			}
		}
	}
}
