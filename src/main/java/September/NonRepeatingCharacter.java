package September;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "masum raza delhi patna amnoour";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.println("non repeating character is : " + c);
			}
		}
	}

}
