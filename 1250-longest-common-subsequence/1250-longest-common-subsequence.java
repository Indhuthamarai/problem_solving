class Solution {
    public int LCS(int i,int j,int n1,int n2,String t1,String t2,int [][]dp){
        if(i>=n1 || j>=n2){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            if(t1.charAt(i)==t2.charAt(j)){
                return dp[i][j]=1+LCS(i+1,j+1,n1,n2,t1,t2,dp);
            }
            else{
                return dp[i][j]=Math.max(LCS(i+1,j,n1,n2,t1,t2,dp),LCS(i,j+1,n1,n2,t1,t2,dp));
            }
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int i=0,j=0;
        int dp[][]=new int[n1+1][n2+1];
        Arrays.stream(dp).forEach(a->Arrays.fill(a,-1));
        return LCS(0,0,n1,n2,text1,text2,dp);
}
}