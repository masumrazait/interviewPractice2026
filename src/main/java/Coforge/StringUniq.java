package Coforge;

import java.util.HashSet;
import java.util.Set;

public class StringUniq {
	public static void main(String[] args) {
		String str = "write your code in this editor and press Run and Debug java program online code in this editor";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			{
				System.out.print(word + " ");
			}
		}
	}
}
