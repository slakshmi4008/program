package Medium;

public class MinInserToFormPalindrome {
	public static void main(String[] args) {
		String str = "geeks";
		int ans = findMinInsertion(str.toCharArray(), 0, str.length() - 1);
		System.out.println(ans);
	}

	private static int findMinInsertion(char[] str, int l, int h) {
		if (l > h)
			return Integer.MAX_VALUE;
		if (l == h)
			return 0;
		if (l == h - 1)
			return (str[l] == str[h]) ? 0 : 1;
		return (str[l] == str[h]) ? findMinInsertion(str, l + 1, h - 1)
				: (Integer.min(findMinInsertion(str, l, h - 1), findMinInsertion(str, l + 1, h)) + 1);
	}
}
