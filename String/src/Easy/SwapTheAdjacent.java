package Easy;

import java.util.Arrays;

public class SwapTheAdjacent {
	public static void main(String[] args) {
		String string = "Devi";
		int n = string.length();
		if (n % 2 != 0) {
			System.out.println("Cannot swap");
		}
		char[] ch = string.toCharArray();
		for (int i = 0; i < n - 1; i = i + 2) {
			char temp = ch[i];
			ch[i] = ch[i + 1];
			ch[i + 1] = temp;
		}
		System.out.println(Arrays.toString(ch));
	}
}
