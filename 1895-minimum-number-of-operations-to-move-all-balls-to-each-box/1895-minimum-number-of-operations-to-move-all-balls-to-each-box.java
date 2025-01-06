class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];
        int bToL = 0, oToL = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = oToL;
            bToL += boxes.charAt(i) - '0';
            oToL += bToL;
        }
        int bToR = 0, oToR = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += oToR;
            bToR += boxes.charAt(i) - '0';
            oToR += bToR;
        }
        
        return answer;
    }
}