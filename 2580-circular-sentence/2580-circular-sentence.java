class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] w = sentence.split(" ");
        
        for (int i = 0; i < w.length - 1; i++) {
            if (w[i].charAt(w[i].length() - 1) != w[i + 1].charAt(0)) {
                return false;
            }
        }
        return w[w.length - 1].charAt(w[w.length - 1].length() - 1) == w[0].charAt(0);
    }
}
