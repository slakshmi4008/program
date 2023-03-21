package Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public static void main(String[] args) {
		String str = "acb";
		// permute("",str);
		List<String> ans =permuteGeeksList(str, "", new ArrayList<String>());
		 System.out.println(ans);
		
	}

	private static List<String> permuteGeeksList(String str, String ans, List<String> list) {
		if (str.length() == 0) {
			// System.out.println(ans + " ");
			list.add(ans);
			return list;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			permuteGeeksList(ros, ans + ch, list);

		}
		return list;

	}

	private static void permuteGeeks(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			String ros = str.substring(0, i) + str.substring(i + 1);
			permuteGeeks(ros, ans + ch);

		}

	}

	private static void permute(String p, String up) {

		if (up.length() == 0) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);
		permute(p + ch, up.substring(1));
		permute(p, up.substring(1));
	}

}
