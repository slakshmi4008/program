package Medium;

public class MinDelAnagram {
	public static void main(String[] args) {
		String str1 = "bcadeh", str2 = "hea";
		int ans = minDel(str1, str2);
		System.out.println(ans);
	}

	private static int minDel(String str1, String str2) {
		// TODO Auto-generated method stub
		int[] ch1 = new int[26];
		int[] ch2 = new int[26];

		for (int i = 0; i < str1.length(); i++) {
			ch1[str1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			ch2[str2.charAt(i) - 'a']++;
		}
		int result = 0;

		for (int i = 0; i < 26; i++) {
			result += Math.abs(ch1[i] - ch2[i]);
		}
		return result;
	}
}
