class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m= new HashMap<>();
        int n=nums.length;
        int res[]=new int[2];
        for(int i=0;i<n;i++){
            if(m.containsKey(target-nums[i])){
                return new int[]{i,m.get(target-nums[i])};
            }
            else{
                m.put(nums[i],i);
            }
        }
        return new int[]{};

    }
}