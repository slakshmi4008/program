package problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
	public static void main(String[] args) {
		Integer arr1[] = { 12, 13, 5, 16, 9, 19 };
		Integer arr2[] = { 16, 2, 60, 9, 8, 5 };

		Set<Integer> set = new HashSet<>();

		set.addAll(Arrays.asList(arr1));
		set.addAll(Arrays.asList(arr2));

		Integer union[] = {};
		union = set.toArray(union);

		System.out.println("Union of two arrays is: " + Arrays.toString(union));

	}
}
