class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int Largest=0,count=0;
        Arrays.sort(nums);
        Set<Integer> s=new HashSet<>();
        for(int  num:nums){
            s.add(num);
        }
        for(int  num:nums){
            if(!s.contains(num-1)){
                int current=num;
                count=1;
                while(s.contains(current+1)){
                    s.remove(current);
                    current++;
                    count++;
                }
                Largest=Math.max(Largest,count);
            }
        }
        return Largest;
    }
}