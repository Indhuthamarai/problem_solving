class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] frequency1=new int[26];
        int[] frequency2=new int[26];
        HashSet<Integer> s=new HashSet<Integer>();
        for(char c:word1.toCharArray())
        {
            frequency1[c-'a']++;
            s.add(c-'a');
        }
        for(char c:word2.toCharArray())
        {
            if(!s.contains(c-'a')){
                return false;
            }
            else{
            frequency2[c-'a']++;
            }
        }
        Arrays.sort(frequency1);
        Arrays.sort(frequency2);
        return Arrays.equals(frequency1,frequency2);
    }
}