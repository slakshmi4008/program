package Recursion;

public class MinPath {
	public static void main(String[] args) {
		int ans = findUniqPath(2, 1);
		System.out.println(ans);
	}

	private static int findUniqPath(int i, int j) {
		// TODO Auto-generated method stub
		if (i == 0 && j == 0) {
			return 1;
		}
		if (i < 0 || j < 0)
			return 0;

		int up = findUniqPath(i - 1, j);
		int left = findUniqPath(i, j - 1);

		return up + left;
	}
}
