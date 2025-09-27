package October;

public class VowelLetterCount {
	public static void main(String[] args) {
		String str = "masumumbrella";
		String v = "AEIOUaeiou";
		System.out.print("vowel leter is: ");
		for (char c : str.toCharArray()) {
			if (v.indexOf(c) != -1) {
				System.out.print( c+" ");
			}
		}
	}
}
