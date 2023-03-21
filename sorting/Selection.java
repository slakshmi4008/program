package sorting;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int[] nums = { 5, 3, 4, 3, 9 };
		int[] ans = selection(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] selection(int[] nums) {
		int minIndex = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[minIndex]) {
					minIndex = j;
				}
			}
			int temp = nums[minIndex];
			nums[minIndex] = nums[i];
			nums[i] = temp;
		}
		return nums;
	}

}
