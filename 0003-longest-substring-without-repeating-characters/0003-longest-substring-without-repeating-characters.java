class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxlen=0;
        int n=s.length();
        Map<Character,Integer> m =new HashMap<Character,Integer>();
        while(r<n){
            if(m.containsKey(s.charAt(r))){
                l=Math.max(l,m.get(s.charAt(r))+1);
            }
            
            m.put(s.charAt(r),r);
            
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}