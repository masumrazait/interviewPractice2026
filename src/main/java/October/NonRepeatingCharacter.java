package October;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "masum";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println("non repeating: "+c);
				
				
			}
		}
		for (char d : str.toCharArray()) {
			if (str.indexOf(d) != str.lastIndexOf(d)) {
				System.out.println("repeating: "+d);
			}
		}
	}
}
