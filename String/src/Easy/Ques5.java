package Easy;

public class Ques5 {

	public static void main(String[] args) {
		String str = "asdf";
		String str1 = "LKJH";
		String ans = "";
		// System.out.println(str.toUpperCase());
		// System.out.println(str.toLowerCase());
		/*for (int i = 0; i < str.length(); i++) {
			char ch = (char) (str.charAt(i) - 32);
			ans = ans + ch;
			// System.out.println(ch);
			System.out.println(ans);

		}*/
		for (int i = 0; i < str1.length(); i++) {
			char ch = (char) (str1.charAt(i) + 32);
			ans = ans + ch;
			// System.out.println(ch);
			System.out.println(ans);
		}
	}
}
