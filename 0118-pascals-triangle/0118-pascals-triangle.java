class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        result.add(Arrays.asList(1));
        for(int i=1;i<numRows;i++)
        {
            List<Integer> y=new ArrayList<Integer>();
            y.add(1);
            for(int j=1;j<i;j++)
            {
                y.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            y.add(1);
            result.add(y);
        }
        return result;
    }
}