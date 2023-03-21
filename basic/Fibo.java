package basic;

public class Fibo {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++)
			System.out.println(recursion(i));
		// iterative();
	}

	public static void iterative() {
		int n1 = 1;
		int n2 = 1;
		int n3;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 3; i <= 12; i++) {
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}

	public static int recursion(int n) {
		if (n == 1 || n == 2)
			return 1;

		return recursion(n - 1) + recursion(n - 2);
	}
}
