class Solution {
    public int findNumbers(int[] nums) {
        int l=nums.length,c=0,f=0;
        for(int i=0;i<l;i++){
            f=0;
           while(nums[i]>0){
            nums[i]=nums[i]/10;
            f++;
           }
           if(f%2==0){
            c++;
           }
        }
        return c;
    }
}