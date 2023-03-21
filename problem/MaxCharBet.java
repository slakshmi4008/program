package problem;

public class MaxCharBet {
	public static void main(String[] args) {
		String str = "socks";
		findMaxChar(str);
	}

	private static void findMaxChar(String str) {
		int max = 0;
		int currMax = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			currMax = 0;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					currMax = j - i - 1;
				}
			}
			if (currMax > max) {
				max = currMax;
			}
		}
		System.out.println(max);
	}
}
