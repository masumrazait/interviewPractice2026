package NovemberJavaCoding;

public class ReveseSentence {
	public static void main(String[] args) {
		String str = "Masum Raza delhi patna bihar";
		String RevSentence = "";
		String words[] = str.split(" ");
		for(String word:words) {
			String revWords="";
			int len=word.length();
			for(int i=len-1;i>=0;i--) {
				revWords=revWords+word.charAt(i);
			}
			RevSentence=RevSentence+revWords+" ";
		}
		System.out.println(RevSentence.trim());
	}
}
