class Solution {
    public int maxScore(String s) {
        int zero = 0, one = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            }
        }
        if (s.charAt(0) == '0') zero++;
        int res = zero + one;
        for (int r = 1; r < s.length() - 1; r++) {
            if (s.charAt(r) == '0') zero++;
            else if (s.charAt(r) == '1') one--;
            res = Math.max(res, zero + one);
        }
        return res;
    }
}