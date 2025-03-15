class Solution {
    public int maxProduct(int[] nums) {
        int l=nums.length;
        int left=1;
        int right=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            if(left==0){
                left=1;
            }
            if(right==0){
                right=1;
            }
            left*=nums[i];
            int j=l-1-i;
            right*=nums[j];
            max=Math.max(max,Math.max(left,right));
        }
        return max;
    }
}