package JavaInterview_Code_Wipro;

public class Rev {
	public static void main(String[] args) {
		String str = "Write your code in this editor and pres";
		String words[] = str.split(" ");
		String revSen = "";
		for (String word : words) {
			String wordRev = "";
			int len = word.length();
			for (int i = len - 1; i >= 0; i--) {
				wordRev = wordRev + word.charAt(i);
			}
			revSen = revSen + wordRev + " ";
		}
		System.out.print(revSen.trim());
	}
}