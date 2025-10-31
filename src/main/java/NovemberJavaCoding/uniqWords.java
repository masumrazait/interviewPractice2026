package NovemberJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class uniqWords {
	public static void main(String[] args) {
		String str="Run and Debug java program online Write your code in java java this editor and press";
		String word[]=str.split(" ");
		Set<String>uniq=new HashSet<>();
		for(String words:word){
		    uniq.add(words.trim());
		}
		for(String words:uniq){
		    System.out.println(words);
		}	    
	}
}
	