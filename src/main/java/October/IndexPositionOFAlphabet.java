package October;

import org.apache.tools.ant.taskdefs.Length;

public class IndexPositionOFAlphabet {
	public static void main(String[] args) {
		String str = "masum";
		char c = 'u';
		int index = str.indexOf(c);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				System.out.println(i + " ");
			}
		}
	}
}
