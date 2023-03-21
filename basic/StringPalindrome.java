package basic;

public class StringPalindrome {
	public static void main(String[] args) {
		boolean ans = isPalindrome("");
		System.out.println(ans);
	}

	public static boolean isPalindrome(String str) {
		if (str.isEmpty())
			return false;
		String reverse = reverse(str);
		if (reverse.equals(str))
			return true;
		else
			return false;
	}

	public static String reverse(String str) {
		if (str == null || str.isEmpty())
			return str;

		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}
}
