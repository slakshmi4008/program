package Medium;

public class PermutationDistinct {
	public static void main(String[] args) {
		String str = "gee";
		permute(str, "");
	}

	private static void permute(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		boolean[] repeat = new boolean[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			if (repeat[ch - 'a'] == false) {
				permute(ros, ans + ch);
			}

			repeat[ch - 'a'] = true;
		}
	}
}
