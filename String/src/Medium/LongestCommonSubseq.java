package Medium;

public class LongestCommonSubseq {
	public static void main(String[] args) {
		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		int m = str1.length();
		int n = str2.length();

		int ans = lcs(ch1, ch2, m, n);
		System.out.println(ans);

	}

	private static int lcs(char[] ch1, char[] ch2, int m, int n) {
		if (m == 0 || n == 0) {
			return 0;	
		}
		if (ch1[m-1] == ch2[n-1]) {
			return 1 + lcs(ch1, ch2, m-1, n-1);
		} else {
			return max(lcs(ch1, ch2, m, n - 1), lcs(ch1, ch2, m - 1, n));
		}
	}

	private static int max(int a, int b) {

		return (a > b) ? a : b;
	}
}
