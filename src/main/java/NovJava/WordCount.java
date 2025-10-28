package NovJava;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String input = "raza patna blr ptn amn dell hp ms cg cts tcs tcs ms raza patna blr ptn";
		String word[]=input.split(" ");
		Map<String, Integer>wordCount=new HashMap<String, Integer>();
		for(String words:word) {
			wordCount.put(words, wordCount.getOrDefault(words, 0)+1);
		}
		for(String words:wordCount.keySet()) {
			System.out.println(words + " = " + wordCount.get(words));
		}
	}

}
