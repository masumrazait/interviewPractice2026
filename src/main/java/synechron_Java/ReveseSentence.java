package synechron_Java;

public class ReveseSentence {
	public static void main(String[] args) {
		String str="teg elgniS kcarT lanigirO yarra esrever yarra";
		String words[]=str.split(" ");
		String revSet="";
		for(String word:words) {
			int len=word.length();
			String revWord="";
			for(int i=len-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			revSet=revSet+revWord+" ";
		}
		System.out.println(revSet.trim());
	}

}
