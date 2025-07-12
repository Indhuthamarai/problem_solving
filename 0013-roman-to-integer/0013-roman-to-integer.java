class Solution {
    public int romanToInt(String s) {
        int number=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int a[]={1,5,10,50,100,500,1000};
        char[] c={'I','V','X','L','C','D','M'};
        for(int i=0;i<7;i++)
        {
            map.put(c[i],a[i]);
        }
        number+=map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            if(((s.charAt(i+1)=='V'||s.charAt(i+1)=='X')&&(s.charAt(i)=='I'))||((s.charAt(i+1)=='L'||s.charAt(i+1)=='C')&&(s.charAt(i)=='X')||((s.charAt(i+1)=='D'||s.charAt(i+1)=='M')&&s.charAt(i)=='C')))
            {
                number-=map.get(s.charAt(i));
            }
            else{
            number+=map.get(s.charAt(i));
            }

        }
        return number;
    }
}