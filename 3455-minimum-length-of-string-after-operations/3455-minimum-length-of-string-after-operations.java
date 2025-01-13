class Solution {
    public int minimumLength(String s) {
        int[] Frequency = new int[26];
        int total= 0;
        for (char c : s.toCharArray()) {
            Frequency[c - 'a']++;
        }
        for (int frequency : Frequency) {
            if (frequency == 0) continue;
            if (frequency % 2 == 0) {
                total += 2;
            } else {
                total += 1;
            }
        }
        return total;
    }
}