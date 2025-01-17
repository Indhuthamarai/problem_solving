class Solution {
    public int compress(char[] chars) {
        int i,l=chars.length;
        StringBuilder s=new StringBuilder();
        int count=1;
        for(i=0;i<l;i++){
            if(i+1<l && chars[i]==chars[i+1])
            {
                count++;
            }
            else{
                s.append(chars[i]);
                if(count>1){
                    s.append(count);
                }
                count=1;
            }
        }
        for(int j=0;j<s.length();j++){
            chars[j]=s.charAt(j);
        }
        return s.length();
    }
}