package September;

public class WordCountInString {

	public static void main(String[] args) {
		String str="Auto public static void main public static void main public static void mainpublic static void mainpublic static void mainpublic static void main";
		int count=1;
		for(int i=0;i<=str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
