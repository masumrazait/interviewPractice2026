package Sept21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FIndDublicateElemetFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 23, 3, 4, 32, 1, 23, 234, 2));
		Set<Integer> set = new HashSet<Integer>(list);
		list.clear();
		set.addAll(list);
		System.out.println(set);

	}

}
