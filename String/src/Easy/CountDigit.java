package Easy;

public class CountDigit {
	public static void main(String[] args) {
		String s = "coding is easier in Java 1234567890";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		String s1 = "1234";
		System.out.println(Integer.parseInt(s1)+1);
	}
}
