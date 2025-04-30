class Solution {
    public int findNumbers(int[] nums) {
        int l=nums.length,c=0;
        for(int i=0;i<l;i++){
            String s=Integer.toString(nums[i]);
            if(s.length()%2==0){
                c++;
            }
        }
        return c;
    }
}