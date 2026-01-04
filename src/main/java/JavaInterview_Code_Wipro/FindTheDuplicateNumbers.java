package JavaInterview_Code_Wipro;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumbers {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 333, 44, 21, 323, 11, 33, 22, 44, 66, 77 };
		String str="delhipatnabihar";
		Set<Integer> uniqNum = new HashSet<>();
		Set<Integer> dubNum = new HashSet<>();
		Set<Character> uniqStr = new HashSet<>();
		Set<Character> dubStr = new HashSet<>();
		for (int num : arr) {
			if(!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		for(char c:str.toCharArray()) {
			if(!uniqStr.add(c)) {
				dubStr.add(c);
			}
		}
		System.out.println(uniqNum);
		System.out.println(uniqStr);
	}
}
