package basic;

public class WhiteSpace {
	public static void main(String[] args) {
		String str = " abc ";
		System.out.println(str.trim());
		String str1 = " abc    xyz";
		System.out.println(str1.replaceAll("\s", ""));
		String str2 = "abc";
		int count = 0;
		for (char ch : str2.toCharArray()) {
			count++;
		}
		System.out.println(count);
		System.out.println(rec(str2, 0));

	}

	private static int rec(String str, int count) {
		if (str=="") {
			return count;
		}
		return rec(str.substring(1), count + 1);

	}
}
