package Oct25;

public class EvenLetterPrintFromStrings {
	public static void main(String[] args) {
		String str = "patnabihaa";
		for(int i=1;i<=str.length()-1;i+=2) {
			System.out.print(str.charAt(i)+" ");
		}
	}
}
