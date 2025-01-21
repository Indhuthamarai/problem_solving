class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int[] leftMini=new int[n];
        int[] rightMax=new int[n];
        leftMini[0]=nums[0];
        rightMax[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            leftMini[i]=Math.min(leftMini[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>leftMini[i] && nums[i]<rightMax[i]){
                return true;
            }
        }
        return false;
    }
}