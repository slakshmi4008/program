package sorting;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int[] nums = { 5, 8, 4, 3, 9 };
		int[] ans = bubble(nums);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] bubble(int[] nums) {
		// TODO Auto-generated method stub
		boolean swapped;
		for (int i = 0; i < nums.length; i++) {
			swapped = false;
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				return nums;
		}
		return nums;
	}
}
