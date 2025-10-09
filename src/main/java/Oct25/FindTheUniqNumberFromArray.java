package Oct25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheUniqNumberFromArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,22, 22, 33, 44, 33, 22, 11));
		Set<Integer> c = new HashSet<Integer>(list);
		list.addAll(c);
		list.clear();
		System.out.println(c);
	}

}
