package basic;

public class Prime {
	public static void main(String[] args) {
		// boolean ans = isPrime(5);
		// boolean ans = isPrimeNumber(1);
		String ans = isPrimeOrNot(-2);
		System.out.println(ans);
	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i < (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPrimeNumber(int n) {
		if (n == 0 || n == 1)
			return false;
		if (n == 2 || n == 3) {
			return true;
		}
		if (n % 2 == 0)
			return false;
		for (int i = 3; i < (int) Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static String isPrimeOrNot(int n) {
		if (n < 0)
			return "not valid";
		if (n == 0 || n == 1)
			return "not prime";
		if (n == 2 || n == 3) {
			return "prime";
		}

		if ((n * n - 1) % 24 == 0) {
			return "prime";
		} else {
			return "not prime";
		}

	}
}
