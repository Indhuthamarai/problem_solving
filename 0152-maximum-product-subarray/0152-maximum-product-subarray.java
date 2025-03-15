class Solution {
    public int maxProduct(int[] nums) {
        int l=nums.length;
        int max=nums[0];
        for(int i=0;i<l;i++){
            int mul=1;
            for(int j=i;j<l;j++){
                mul*=nums[j];
                max=Math.max(max,mul);
            }
        }
        return max;
    }
}