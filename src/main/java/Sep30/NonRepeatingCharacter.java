package Sep30;

public class NonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "masum";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.println("non repating charcter: " + c);
			}
		}
	}
}
