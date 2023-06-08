public class Solution {
	public static int uniquePaths(int m, int n) {
		if(m==1 || n==1) return 1;
		int dp[][] = new int[m+1][n+1];
		for(int i[]: dp)
			Arrays.fill(i, -1);
		return uniquePaths(m, n, dp);
	}
	private static int uniquePaths(int m, int n, int dp[][]){
		if(m==1||n==1) return 1;
		if(dp[m][n]!=-1) return dp[m][n];
		return dp[m][n] = uniquePaths(m-1, n, dp) + uniquePaths(m, n-1, dp);
	}
}