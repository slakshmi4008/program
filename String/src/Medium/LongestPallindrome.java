package Medium;

public class LongestPallindrome {
	public static void main(String[] args) {
		String seq = "GEEKSFORGEEKS";
		int n = seq.length();
		int max = lps(seq.toCharArray(), 0, n - 1);
		System.out.println(max);

	}

	private static int lps(char[] seq, int i, int j) {
		// base condition if there is only one character
		if (i == j)
			return 1;

		// base condition 2 if there is 2 characters
		if (seq[i] == seq[j] && i + 1 == j) {
			return 2;
		}

		// if first and last charater match
		if (seq[i] == seq[j]) {
			return lps(seq, i + 1, j - 1) + 2;
		}

		// if first and last characters do not match
		return max(lps(seq, i, j - 1), lps(seq, i + 1, j));

	}

	private static int max(int x, int y) {
		// TODO Auto-generated method stub
		return (x > y) ? x : y;

	}
}
