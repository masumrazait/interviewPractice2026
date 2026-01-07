package Infosys;

public class NonRepeatingCharacte {
	public static void main(String[] args) {
		String str = "masumraza";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
	}
}
