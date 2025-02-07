class Solution {
    public String toLowerCase(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                str[i] = (char) (str[i] + 32);
            }
        }
        return new String(str);
    }
}