class Solution {
    public int countSegments(String s) {
        String st[]=s.split(" ");
        int c=0;
        for(String str:st)
        {
            if(!str.isEmpty())
            {
                c++;
            }
        }
        return c;
    }
}