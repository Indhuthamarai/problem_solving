class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0,m=0,h=n-1;
        while(m<=h){
            if(nums[m]==0){
                int temp=nums[m];
                nums[m]=nums[l];
                nums[l]=temp;
                m++;
                l++;
            }
            else if(nums[m]==1)m++;
            else{
                int te=nums[m];
                nums[m]=nums[h];
                nums[h]=te;
                h--;
            }
        }
    }
}