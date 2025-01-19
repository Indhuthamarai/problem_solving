class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b=new ArrayList<>();
        int l=candies.length,max=Arrays.stream(candies).max().getAsInt();
        for(int num:candies){
            if((num+extraCandies)>=max){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;
    }
}