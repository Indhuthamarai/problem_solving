class Solution {
    public int findMin(int[] nums) {
        int n=nums.length,res=0;
        int l=0,h=n-1,mid=(l+h)/2;
        if(nums[l]<nums[h]){
             res=nums[l];
        }
        else{
            while(mid<h){
            if(nums[mid]>nums[h]){
                l=mid+1;
            }
            else{
                h=mid;
            }
            mid=(l+h)/2;
            }
            res=nums[l];
        }

        return res;
    }
}