package problem;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 3 };
		findDuplicates(nums);
	}

	private static void findDuplicates(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		}

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1)
				System.out.println(e.getKey());
		}

	}
}
