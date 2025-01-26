class Solution {
    public int robbed(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.max(robbed(nums,i+1,dp),robbed(nums,i+2,dp)+nums[i]);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return robbed(nums,0,dp);
    }
}