package Easy;

public class Interlace {
	public static void main(String[] args) {
		String str = "SkillRack";

		String vowels = "";
		String consonents = "";

		for (char c : str.toCharArray()) {
			char ch = Character.toLowerCase(c);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels += c;
			} else {
				consonents += c;
			}
		}
		int i = 0;
		int j = consonents.length() - 1;

		while (i < vowels.length() || j >= 0) {
			if (i < vowels.length()) {
				System.out.print(vowels.charAt(i++));
			}
			if (j >= 0) {
				System.out.print(consonents.charAt(j--));
			}
		}
	}
}
