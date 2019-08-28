package leetcode;

public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(f(10,9));
	}

	public static int f(int m,int n) {
		int[][] dp = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==0||j==0) dp[i][j] = 1;
				else{
					dp[i][j] = dp[i-1][j]+dp[i][j-1];
				}
			}
		}
		return dp[m-1][n-1];
	}
	
	public static int uniquePathsWithObstacles(int[][] obstacleGrid){
		int rows = obstacleGrid.length;
		int cols = obstacleGrid[0].length;
		int[][] dp = new int[rows][cols];
		if(obstacleGrid[0][0]==1) return 0;
 		for(int i=0;i<rows;i++){
			if(obstacleGrid[i][0]==1){
				dp[i][0] = 0;
				break;
			}
		}
		for(int i=0;i<cols;i++){
			if(obstacleGrid[0][i]==1){
				dp[0][i] = 0;
				break;
			}
		}
		for(int i=1;i<rows;i++){
			for(int j=1;j<cols;j++){
				if(obstacleGrid[i][j]==1){
					dp[i][j] = 0;
				}else{
					dp[i][j] = dp[i-1][j]+dp[i][j-1];
				}
			}
		}
		return dp[rows-1][cols-1];
	}
}
