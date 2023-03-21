package Medium;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumAnagramLength {
	public static void main(String[] args) {
		String arr[] = { "ant", "magenta", "magnate", "tan", "gnamate" };
		int n = arr.length;
		System.out.println(largestAnagramSet(arr, n));
	}

	private static int largestAnagramSet(String[] arr, int n) {
		int maxSize = 0;
		HashMap<String, Integer> count = new HashMap<>();

		for (int i = 0; i < n; ++i) {

			// sort the String
			char temp[] = arr[i].toCharArray();
			Arrays.sort(temp);
			arr[i] = new String(temp);

			// Increment the count of String
			if (count.containsKey(arr[i])) {
				count.put(arr[i], count.get(arr[i]) + 1);
			} else {
				count.put(arr[i], 1);
			}

			// Compute the maximum size of String
			maxSize = Math.max(maxSize, count.get(arr[i]));
		}
		return maxSize;
	}

}
