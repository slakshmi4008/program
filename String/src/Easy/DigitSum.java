package Easy;

public class DigitSum {
	public static void main(String[] args) {
		String str1 = "dhj34dfhf9fs";
		int sum = 0;

		for (char c : str1.toCharArray()) {
			if (Character.isDigit(c)) {
				System.out.print("Digits in the String : " + c);
				System.out.println();
				sum += Integer.parseInt(c + "");
			}
		}
		System.out.println(sum);
	}
}
