class Solution {
    public void moveZeroes(int[] nums) {
        int h=nums.length;
        int l=0,m=0;
        while(m<h){
            if(nums[m]!=0){
                swap(nums,l,m);
                l++;
            }
            m++;
        }
    }
    public void swap(int[] nums,int l,int m){
        int temo=nums[l];
        nums[l]=nums[m];
        nums[m]=temo;
    }
}