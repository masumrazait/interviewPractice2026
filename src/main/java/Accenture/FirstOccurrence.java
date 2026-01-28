package Accenture;

public class FirstOccurrence {
	public static void main(String[] args) {
		String str="removeFirstOccurrence";
		for(char c:str.toCharArray()) {
			if(str.indexOf(c)==str.lastIndexOf(c)) {
				System.out.print(c);
			}
		}
	}
}
