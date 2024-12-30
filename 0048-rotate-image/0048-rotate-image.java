class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public void transpose(int[][] m){
        int n=m.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            int t=m[j][i];
            m[j][i]=m[i][j];
            m[i][j]=t;
            }
        }
    }
    public void reverse(int[][] m){
        int n=m.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t=m[i][j];
                m[i][j]=m[i][n-j-1];
                m[i][n-j-1]=t;
            }
        }
    }
}