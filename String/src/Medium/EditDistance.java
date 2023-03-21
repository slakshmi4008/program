package Medium;

public class EditDistance {
	public static void main(String[] args) {
		String str1 = "gfg";
		String str2 = "gf";

		if (isEditDistance(str1, str2)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	private static boolean isEditDistance(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();
		int count = 0;

		if (Math.abs(m - n) > 1)
			return false;

		int i = 0;
		int j = 0;

		while (i < m && j < n) {
			if (str1.charAt(i) != str2.charAt(j)) {
				if (m > n) {
					i++;
				} else if (m < n) {
					j++;
				} else {
					i++;
					j++;
				}
				count++;
			} else {
				i++;
				j++;
			}
		}
		if (i < m || j < n)
			count++;

		return count == 1;

	}
}
