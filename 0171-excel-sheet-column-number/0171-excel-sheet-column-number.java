class Solution {
    public int titleToNumber(String columnTitle) {
        char c[]=columnTitle.toCharArray();
        int res=0;
        if(c.length==1)
        {
            return (int)(c[0]-'A'+1);
        }
        System.out.println(res);
        for(int i=0;i<c.length;i++)
        {
            res=(res*26)+(int)(c[i]-'A'+1);
            
        }
        return res;
    }
}