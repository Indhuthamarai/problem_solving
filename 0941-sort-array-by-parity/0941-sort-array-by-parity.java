class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int lp = 0;
        int rp = nums.length - 1;
        while(lp<rp){
            if(nums[lp] % 2 == 1 && nums[rp] % 2 == 0){
                int temp = nums[lp];
                nums[lp] = nums[rp];
                nums[rp] = temp;
                lp++;
                rp--;
            }
            else if(nums[lp] % 2 == 0 && nums[rp] % 2 == 1){
                lp++;
                rp--;
            }
            else if(nums[lp] % 2 == 1 && nums[rp] % 2 == 1){
                rp--;
            }
            else if(nums[lp] % 2 == 0 && nums[rp] % 2 == 0){
                lp++;
            }
        }
        return nums;
        
    }
}
