class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        int sum=0,i=0,pl=0;
        if (l == 1) {
			if (flowerbed[0] == 0) {
				return n <= 1;
			}
		}
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
			flowerbed[0] = 1;
			pl++;
		}
        if (l>= 3 && flowerbed[l - 1] == 0
				&& flowerbed[l - 2] == 0) {
			flowerbed[l- 1] = 1;
			pl++;
		}
        for(int j=0;j<l;j++){
            if(flowerbed[j]==1){
                sum=count(i,j,flowerbed);
                if(sum%2!=0){
                    pl+=sum/2;
                }
                else{
                    pl+=(sum-1)/2;
                }
                i=j;
            }
        }
        if(pl>=n){
            return true;
        }
       
        return false;
    }
    public int count(int i,int j,int[] fl){
        int count=0;
        for(int k=i;k<j;k++){
            if(fl[k]==0){
                count++;
            }
        }
        return count;
    }
}