package masum;

public class ReverseEachWord {
	public static void main(String[] args) {
		String str="i am going to kolkata";
		String word[]=str.split(" ");
		String revSentece="";
		for(String words:word) {
			String revWord="";
			int len=words.length();
			for(int i=len-1;i>=0;i--) {
				revWord=revWord+words.charAt(i);
			}
			revSentece=revSentece+revWord+" ";
		}
		System.out.println(revSentece.trim());
	}
}
