class Solution {
    public void backtrack(int s,List<List<Integer>> res,List<Integer> cur,int candidates[],int t){
        if(t<0){
            return;
        }
        if(t==0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=s;i<candidates.length;i++){
            if(i>s && candidates[i]==candidates[i-1]){
                continue;
            }
            cur.add(candidates[i]);
            backtrack(i+1,res,cur,candidates,t-candidates[i]);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0,res,cur,candidates,target);
        return res;
    }
}