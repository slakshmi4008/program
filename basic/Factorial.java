package basic;

public class Factorial {
	public static void main(String[] args) {
		// int ans = fact(5);
		int ans = factorialDoWhile(5);
		System.out.println(ans);

	}

	public static int fact(int num) {
		if (num == 0)
			return 1;

		return num * fact(num - 1);
	}

	public static int factorial(int num) {
		if (num < 0)
			return 0;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static int factorialWhile(int num) {
		if (num < 0)
			return 0;
		int fact = 1;
		while(num>=1) {
			fact = fact * num;
			num--;
		}
		return fact;
	}
	public static int factorialDoWhile(int num) {
		if (num < 0)
			return 0;
		int fact = 1;
		do {
			fact = fact * num;
			num--;
		}while(num>=1);
		return fact;
	}
}
