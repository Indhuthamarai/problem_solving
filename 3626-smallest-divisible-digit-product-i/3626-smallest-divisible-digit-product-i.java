class Solution {
    public int smallestNumber(int n, int t) {
        int n1=n;
        int i,r,p=1;
        do
        {
            p=1;
            int temp=n1;
            while(temp!=0){
                r=temp%10;
                p=p*r;
                temp=temp/10;
            }
            if(p%t==0 || p==0){
                return n1;
            
            }
            else{
                n1=n1+1;
            }
        }while(true);
        
    }
}