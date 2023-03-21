package Medium;

public class MInDelForPalindrom {
	public static void main(String[] args) {
		String seq = "abefbac";
		int ans = lps(seq.toCharArray(), 0, seq.length() - 1);
		System.out.println(ans);
	}

	private static int lps(char[] seq, int i, int j) {
		// base condition if only one character
		if (i == j) {
			return 0;
		}
		if (seq[i] == seq[j]) {
			return lps(seq, i + 1, j - 1);
		}

		return 1 + Math.min(lps(seq, i + 1, j), lps(seq, i, j - 1));
	}

	private static int Min(int x, int y) {

		return (x < y) ? x : y;
	}
}
