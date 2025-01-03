class Solution {
    public boolean canPlace(int r,int c,List<String> cur){
        for(int row=r-1;row>=0;row--){
            if(cur.get(row).charAt(c)=='Q'){
                return false;
            }
        }
        for(int row=r-1,col=c-1;row>=0 && col>=0;row--,col--){
            if(cur.get(row).charAt(col)=='Q'){
                return false;
            }
        }
        for(int row=r-1,col=c+1;row>=0 && col<cur.size();row--,col++){
            if(cur.get(row).charAt(col)=='Q'){
                return false;
            }
        }
        return true;

    }
    public void backtrack(int r,int[] res,List<String> cur){
        if(r==cur.size()){
            res[0]++;
            return;
        }
        for(int col=0;col<cur.size();col++){
            if(canPlace(r,col,cur)){
                StringBuilder sb=new StringBuilder(cur.get(r));
                sb.setCharAt(col,'Q');
                cur.set(r,sb.toString());
                backtrack(r+1,res,cur);
                sb.setCharAt(col,'.');
                cur.set(r,sb.toString());
            }
        }
    }
    public int totalNQueens(int n) {
        int[] res={0};
        List<String> cur=new ArrayList<>();
        for(int i=0;i<n;i++){
            cur.add(".".repeat(n));
        }
        backtrack(0,res,cur);
        return res[0];
    }
}