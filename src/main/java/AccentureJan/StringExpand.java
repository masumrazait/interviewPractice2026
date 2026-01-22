package AccentureJan;

public class StringExpand {
	public static void main(String[] args) {
		String str="g5h2k4";
		String result="";
		for(int i=0;i<str.length()-1;i+=2) {
			char c=str.charAt(i);
			int count=Character.getNumericValue(str.charAt(i+1));
			for(int j=1;j<=count;j++) {
				result=result+c+" ";
			}
		}
		System.out.println(result);
	}

}
