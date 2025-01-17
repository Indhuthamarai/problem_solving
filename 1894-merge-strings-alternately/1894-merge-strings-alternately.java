class Solution {
    public String mergeAlternately(String word1, String word2) {
        String w="";
        int l1=word1.length();
        int l2=word2.length();
        int i;
        for(i=0;i<Math.max(l1,l2);i++){
            if(i<l1){
                w+=word1.charAt(i);
            }
            if(i<l2){
                w+=word2.charAt(i);
            }
        }
    return w;
    }
}