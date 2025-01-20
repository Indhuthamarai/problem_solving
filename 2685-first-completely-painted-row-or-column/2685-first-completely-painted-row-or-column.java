class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Map<Integer, int[]> p = new HashMap<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                p.put(mat[i][j], new int[]{i, j});
            }
        }
        
        int[] r = new int[row];
        int[] c= new int[col];
        for(int i = 0; i < arr.length; i++) {
            int[] pa = p.get(arr[i]);
            r[pa[0]]++;
            c[pa[1]]++;
            if(r[pa[0]] == col || c[pa[1]] == row)
                return i;
        }
        return arr.length - 1;
    }
}