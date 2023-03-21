package basic;

public class ReverseWords {
	public static void main(String[] args) {
		String str = "one  two three";
		rev(str);
	}

	private static void rev(String str) {
		// TODO Auto-generated method stub'
		if (str == null || str.isEmpty())
			System.out.println("Invalid or empty");

		String[] word = str.trim().split("\\s");

		for (int i = word.length-1; i >= 0; i--) {
			System.out.print(word[i].trim() + " ");
		}
	}
}
