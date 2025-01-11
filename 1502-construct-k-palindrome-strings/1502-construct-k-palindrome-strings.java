class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        int[] freq = new int[26];
        char[] characters = s.toCharArray();
        int unique = 0;
        for (char c : characters) {
            freq[c - 'a']++;
        }
        for (int i : freq) {
            if (i % 2 != 0) {
                unique++;
            }
        }
        return unique <= k;
    }
}