package problem;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 9, 10, 15, 20 };
		int[] arr2 = { 2, 3, 8, 13 };

		int m = arr1.length;
		int n = arr2.length;

		merge(arr1, arr2, m, n);

	}

	private static void merge(int[] arr1, int[] arr2, int m, int n) {
		// TODO Auto-generated method stub

		for (int i = n - 1; i >= 0; i--) {

			int j = 0;
			int last = arr1[m - 1];

			for ( j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
				arr1[j + 1] = arr1[j];
			}
			if (last > arr2[i]) {
				arr1[j + 1] = arr2[i];
				arr2[i] = last;
			}

		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}
}
