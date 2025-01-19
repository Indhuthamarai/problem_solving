class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        Arrays.sort(piles);
        int l=1,hi=piles[n-1];
        while(l<hi){
            int sum=0;
            int m=l+(hi-l)/2;
            for(int j=0;j<n;j++){
                sum+=Math.ceil((double)piles[j]/m);
                
            }
            if(sum<=h){
                hi=m;
               
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}
