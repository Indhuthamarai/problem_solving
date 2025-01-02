class Solution {
    public int solve(int i,int j,int[][] grid,int[][] dp,int m,int n){
        if(i>m-1 || j>n-1){
            return 0;
        }
        if(i==m-1 && j==n-1 && grid[i][j]!=1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(grid[i][j]==1){
            // dp[i][j]=-1;
            return 0;
        }
        return dp[i][j]=solve(i+1,j,grid,dp,m,n)+solve(i,j+1,grid,dp,m,n);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m+1][n+1];
        Arrays.stream(dp).forEach(a->Arrays.fill(a,-1));
        int res=solve(0,0,obstacleGrid,dp,m,n);
        return res;
    }
}