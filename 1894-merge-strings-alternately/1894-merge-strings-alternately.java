class Solution {
    public String mergeAlternately(String word1, String word2) {
        String w="";
        int l1=word1.length();
        int l2=word2.length();
        int i,j;
        for(i=0,j=0;i<l1 && j<l2;i++,j++){
            w+=word1.charAt(i);
            w+=word2.charAt(j);
        }
        if(i!=l1){
            while(i!=l1){
                w+=word1.charAt(i);
                i++;
            }
        }
        if(j!=l2){
            while(j!=l2){
                w+=word2.charAt(j);
                j++;
            }
        }
    return w;
    }
}