package September;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,44,44,22,33, 2, 2, 3, 4, 4, 5));
		Set<Integer> set = new LinkedHashSet<>(list);
		list.clear();
		list.addAll(set);
		System.out.println(set);

	}

}
