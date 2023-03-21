package basic;

public class Gcd {
	public static void main(String[] args) {
		int n1 = 54;
		int n2 = 24;
		System.out.println(findGCD(n1, n2));

	}

	private static int findGCD(int n1, int n2) {
		if (n2 == 0)
			return n1;

		return findGCD(n2, n1 % n2);
	}
}
