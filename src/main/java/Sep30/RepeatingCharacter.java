package Sep30;

public class RepeatingCharacter {
	public static void main(String[] args) {
		String str = "masimrazapatnamahi";
		System.out.print("repating character is : ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) != (str.lastIndexOf(c))) {
				System.out.print(c + " ");
			}
		}
	}
}
