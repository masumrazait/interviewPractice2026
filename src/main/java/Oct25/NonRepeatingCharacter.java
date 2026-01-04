package Oct25;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masum";
		System.out.print("non-repeating character: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c+" ");
			}
		}
	}
}
