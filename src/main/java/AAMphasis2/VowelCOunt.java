package AAMphasis2;

public class VowelCOunt {
	public static void main(String[] args) {
		String str="VowelCOuntString";
		String vowel="AEIOUaeiou";
		int vc=0;
		int cc=0;
		for(char c:str.toCharArray()) {
			if(vowel.indexOf(c)!=-1) {
				vc++;
				System.out.println(c);
			}else {
				cc++;
			}
		}
		System.out.println("\nvowel count is : "+vc);
		System.out.println("consonant count is : "+cc);
	}

}
