package Easy;

public class Palindrome {
	public static void main(String[] args) {
		String str = "maadam";

		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++,j--) {
			if (str.charAt(i) != str.charAt(j))
				System.out.println("false");

		}
		System.out.println("true");
	}
}
