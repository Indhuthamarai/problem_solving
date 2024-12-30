class Solution {
    public int passThePillow(int n, int time) {
        int m=2*(n-1);
        int res=time%m;
        if(res<n-1){
            return res+1;
        }
        else{
            return n-(res-(n-1));
        }
        
    }
}