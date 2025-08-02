class Solution {
    public int strStr(String haystack, String needle) {
        int l1=haystack.length(),l2=needle.length(),k=0,c=0;
        int i,j=0;
        if(l1<l2)
        {
            return -1;
        }
        for(i=0;i<=l1-l2;i++)
        {
           j=0;
           while(j<l2 && haystack.charAt(i+j)==needle.charAt(j))
           {
             j++;
           }
           if(j==l2)
            {
                return i;
            }
        }
        return -1;
    }
}