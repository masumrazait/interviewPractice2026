package JavaInterview_Code;

public class ReveseSenetnee {
	public static void main(String[] args) {
		String Str = "hello ram delhi patna bihar delhi patna bihar";
		String words[] = Str.split(" ");
		String RevSen = "";
		for (String word : words) {
			String RevWord = "";
			int len = word.length();
			for (int i = len - 1; i >= 0; i--) {
				RevWord = RevWord + word.charAt(i);
			}
			RevSen = RevSen + RevWord + " ";
		}
		System.out.println(RevSen.trim());
	}

}
