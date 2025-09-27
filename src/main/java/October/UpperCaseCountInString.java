package October;

import java.util.HashSet;
import java.util.Set;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String str = "masniMraEDGraxaEF";
		int count = 0;
		for (int i = 0; i <= str.length()-1; i++) {
			char c=str.charAt(i);
			 if (Character.isUpperCase(c)) {
				count++;
				System.out.println("uper character is: " + c);
			}
		}
		System.out.println(count);
	}
}
