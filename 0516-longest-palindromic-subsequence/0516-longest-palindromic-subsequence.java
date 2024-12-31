class Solution {
    public int LPS(int i,int j,int n1,int n2,String t1,String t2,int [][]dp){
        if(i>=n1 || j>=n2){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            if(t1.charAt(i)==t2.charAt(j)){
                return dp[i][j]=1+LPS(i+1,j+1,n1,n2,t1,t2,dp);
            }
            else{
                return dp[i][j]=Math.max(LPS(i+1,j,n1,n2,t1,t2,dp),LPS(i,j+1,n1,n2,t1,t2,dp));
            }
        }
    }
    public int longestPalindromeSubseq(String s) {
        int n1=s.length();
        StringBuffer b=new StringBuffer(s);
        b.reverse();
        String s1=b.toString();
        int n2=s1.length();
        int[][] dp=new int[n1+1][n2+1];
        Arrays.stream(dp).forEach(i->Arrays.fill(i,-1));
        return LPS(0,0,n1,n2,s,s1,dp);
    }
}