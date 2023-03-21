package Easy;

public class Reverse {
	public static void main(String[] args) {
		String str = "asdf";
		int len = str.length();
		String rev = "";
		//iterative(str);
		recursive(str.toCharArray(), 0, len);

	}

	private static void recursive(char[] str, int index, int len) {
		if (index == len) {
			return;
		}

		char temp = str[index];
		recursive(str, index + 1, len);
		System.out.print(temp);
	}

	private static void iterative(String str) {
		// TODO Auto-generated method stub
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
