package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LimitedFreq {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 2, 3, 5 };
		int n = 5;

		findLimitedFreq(nums, n);
	}

	private static void findLimitedFreq(int[] nums, int n) {
		int size = nums.length;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i <n; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for (int i = 1; i <= n; i++) {
			if (map.containsKey(i)) {
				nums[i-1] = map.get(i);
			} else {
				nums[i-1] = 0;
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
