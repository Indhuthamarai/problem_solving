class Solution {
    public int uniquePaths(int m, int n) {
        int N=m+n-2;
        long res=1;
        int c=m-1;
        for(int i=1;i<=c;i++){
            res=res*(N-c+i)/i;
        }
        return (int)res;
    }
}