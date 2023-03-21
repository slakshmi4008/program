package Medium;

public class MinDelAlternate {
	public static void main(String[] args) {
		String str = "11";
		int ans = alternate(str);
		System.out.println(ans);
	}

	private static int alternate(String str) {
		int count = 0;
		if (str.length() == 0)
			return -1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}
}
