package basic;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		reverse(nums);
	}

	private static void reverse(int[] nums) {
		// TODO Auto-generated method stub
		for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
