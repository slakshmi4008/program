package basic;

public class PermuteString {
	public static void main(String[] args) {
		String str = "abc";
		permute(str, "");
	}

	private static void permute(String str, String ans) {
		// TODO Auto-generated method stub
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			permute(ros, ans + ch);
		}

	}
}
