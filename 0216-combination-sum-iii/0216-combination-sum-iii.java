class Solution {
    public void backtrack(int s,List<Integer> cur,List<List<Integer>> res,int t,int c[],int k){
        if(cur.size()==k){
            if(t==0){
                res.add(new ArrayList<>(cur));
            }
            if(t<0){
                return;
            }
        }
        for(int i=s;i<c.length;i++){
            if(i>s && c[i]==c[i-1]){
                continue;
            }
            cur.add(c[i]);
            backtrack(i+1,cur,res,t-c[i],c,k);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        int[] c={1,2,3,4,5,6,7,8,9};
        backtrack(0,cur,res,n,c,k);
        return res;
        }
}