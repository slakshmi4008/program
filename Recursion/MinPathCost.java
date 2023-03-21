package Recursion;

public class MinPathCost {
	public static void main(String[] args) {

		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };

		int ans = findMinPath(grid, grid.length - 1, grid[0].length - 1);

		System.out.println(ans);

	}

	private static int findMinPath(int[][] grid, int m, int n) {
		if (m == 0 && n == 0)
			return grid[0][0];
		if (m < 0 || n < 0)
			return Integer.MAX_VALUE;

		//int up = grid[m][n] + findMinPath(grid, m - 1, n);
		//int left = grid[m][n] + findMinPath(grid, m, n - 1);

		return grid[m][n]+Math.min(findMinPath(grid, m - 1, n), findMinPath(grid, m, n - 1));
	}
}
