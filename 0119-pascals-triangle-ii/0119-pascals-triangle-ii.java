class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> a=new ArrayList<>();
        if(rowIndex==0)
        {
            return Arrays.asList(1);
        }
        a.add(1);
        for(int i=1;i<rowIndex+1;i++)
        {
            List<Integer> b=new ArrayList<>();
            b.add(1);
            for(int j=1;j<i;j++)
            {
                b.add(a.get(j-1)+a.get(j));
            }
            b.add(1);
            a=b;
        }
        return a;
    }
}