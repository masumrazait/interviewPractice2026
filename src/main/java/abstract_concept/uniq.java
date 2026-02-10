package abstract_concept;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class uniq {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> wordCount = new HashedMap<>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) == 1) {
				System.out.println(word + " " + wordCount.get(word));
			}
		}
		int arr[] = { 11, 33, 55, 6, 64, 644, 543, 435, 5, 67, 42 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}

	}
}
