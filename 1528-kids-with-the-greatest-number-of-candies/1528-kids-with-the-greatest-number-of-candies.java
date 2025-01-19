class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b=new ArrayList<>();
        int l=candies.length,max=0;
        for(int i=0;i<candies.length;i++){
        if (max<candies[i]) {
            max=candies[i];
        }
        }
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