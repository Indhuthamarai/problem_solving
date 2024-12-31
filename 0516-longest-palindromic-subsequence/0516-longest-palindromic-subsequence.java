class Solution {
    public int solve(int i,int j,char[] s,int[][] dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }else{
        if(s[i]==s[j]){
            return dp[i][j]=2+solve(i+1,j-1,s,dp);
        }
        else{
            return dp[i][j]=Math.max(solve(i+1,j,s,dp),solve(i,j-1,s,dp));
        }
        }
    }
    public int longestPalindromeSubseq(String s) {
        char []c=s.toCharArray();
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        Arrays.stream(dp).forEach(i->Arrays.fill(i,-1));
        return solve(0,n-1,c,dp);
    }
}