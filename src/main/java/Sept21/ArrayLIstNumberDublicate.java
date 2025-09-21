package Sept21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayLIstNumberDublicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(
				Arrays.asList(11, 22, 33, 44, 55, 55, 66, 11, 22, 33, 4411, 123, 1234, 123, 1234));
		Set<Integer> set = new HashSet<Integer>(list);
		list.clear();
		list.addAll(list);
		System.out.println(set	);
	}

}
