class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k=0,m=0;
        int res[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    k=i;
                    m=j;
                }
            }
        }
        res[0]=k;
        res[1]=m;
        return res;

    }
}