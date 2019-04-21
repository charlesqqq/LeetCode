package medium;

public class Unique_Paths {
	public static void main(String[] args) {
		Unique_Paths test = new Unique_Paths();
		System.out.println(test.uniquePaths(3, 2));
		System.out.println(test.uniquePaths(7, 3));
	}
	
	public int uniquePaths(int m, int n) {
		int[][] paths = new int[n][m];
		for (int i = 0; i < m; i++)
			paths[0][i] = 1;
		for (int i = 0; i < n; i++)
			paths[i][0] = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				paths[i][j] = paths[i][j - 1] + paths[i - 1][j];
			}
			
		}
		return paths[n - 1][m - 1];
	}
}
