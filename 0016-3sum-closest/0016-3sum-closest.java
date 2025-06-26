class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int j;
        int n=nums.length,k=n-1;
        int min_diff=Integer.MAX_VALUE/2;
        int closest=0;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            k=n-1;
            j=i+1;
            while(j<k)
            {
                int tot=nums[i]+nums[j]+nums[k];
                if(tot==target)
                {
                    return tot;
                }
                else if(tot<target)
                {
                    j++;
                }
                else{
                    k--;
                }

                int min=Math.abs(target-tot);
                if(min<min_diff)
                {
                    min_diff=min;
                    closest=tot;
                    
                }         
            }
        }
        return closest;
    }
}