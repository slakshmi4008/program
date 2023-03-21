package sorting;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		int[] nums = { 5, 8, 4, 3, 9 };
		int[] ans = insertion(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] insertion(int[] nums) {
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i + 1; j >0; j--) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
