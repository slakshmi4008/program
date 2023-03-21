package basic;

public class IntegePalindrome {
	public static void main(String[] args) {
		boolean ans = isPalindrome(122);
		System.out.println(ans);
	}

	public static boolean isPalindrome(int num) {
		int numCopy = num;
		int rev = 0;
		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if (rev == numCopy)
			return true;
		else
			return false;
	}
}
