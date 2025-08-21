class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0],curSum=0;
        for(int num:nums)
        {
            if(curSum<0)
            {
                curSum=0;
            }
            curSum+=num;
            if(curSum>maxSum)
            {
                maxSum=curSum;
            }
        }
        return maxSum;
    }
}