class Solution {
    public int waysToSplitArray(int[] nums) {
        long total= 0, left = 0;
        int res = 0;

        for (int num : nums) {
            total += num;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            if (left>= total - left) {
                res++;
            }
        }
        
        return res;
    }
    }