package Recursion;

public class MinPathObstacle {
	public static void main(String[] args) {

		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };

		int ans = findMinPathObs(obstacleGrid, obstacleGrid.length - 1, obstacleGrid[0].length - 1);

		System.out.println(ans);
	}

	private static int findMinPathObs(int[][] obstacleGrid, int m, int n) {
		
		if (m >= 0 && n >= 0 && obstacleGrid[m][n] == 1)
			return 0;
		
		if (m == 0 && n == 0)
			return 1;

		if (m < 0 || n < 0)
			return 0;

		int up = findMinPathObs(obstacleGrid, m - 1, n);
		
		int left = findMinPathObs(obstacleGrid, m, n - 1);

		return up + left;

	}
}
