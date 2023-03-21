package Recursion;

public class ObstacleLoop {
	public static void main(String[] args) {

		int[][] obstacleGrid = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		if (obstacleGrid[0][0] == 1 && obstacleGrid[m - 1][n - 1] == 1) {
			return;
		}
		for (int i = m - 1; i >= 0; i--) {
			for (int j = n - 1; j >= 0; j--) {
				if (obstacleGrid[i][j] == 1) {
					obstacleGrid[i][j] = 0;
				} else {
					if (i == m - 1) {
						if (j == n - 1) {
							obstacleGrid[i][j] = 1;
						} else {
							if (obstacleGrid[i][j + 1] == 1) {
								obstacleGrid[i][j] = 1;
							}
						}
					} else if (j == obstacleGrid[i].length - 1) {
						if (obstacleGrid[i + 1][j] == 1) {
							obstacleGrid[i][j] = 1;
						}
					} else {
						obstacleGrid[i][j] = obstacleGrid[i + 1][j] + obstacleGrid[i][j + 1];
					}
				}
			}
		}

		System.out.println(obstacleGrid[0][0]);

	}
}
