class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> b=new ArrayList<>();
        if(rowIndex==0)
        {
            return Arrays.asList(1);
        }
        res.add(Arrays.asList(1));
        for(int i=1;i<=rowIndex;i++)
        {
            List<Integer> a=res.get(i-1);
            b=new ArrayList<>();
            b.add(1);
            for(int j=1;j<i;j++)
            {
                b.add(a.get(j-1)+a.get(j));
            }
            b.add(1);
            res.add(b);
        }
        return b;
    }
}