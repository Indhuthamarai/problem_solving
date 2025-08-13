class Solution {
    public boolean isSubsequence(String s, String t) {
        int l1=s.length(),l2=t.length();
        if(l1>l2)
        {
            return false;
        }
        int i=0,j=0,c=0;
        while(i<l1 && j<l2)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                c++;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(c==l1)
        {
            return true;
        }
        return false;
    }
}