
class Solution {
    public int myAtoi(String s) {
        int l=s.length();
        int a=0,b=1,c=0;
        while(a<l && s.charAt(a)==' '){
            a++;
        }
        if(a<l && (s.charAt(a)=='-' || s.charAt(a)=='+')){
            if(s.charAt(a)=='-'){
                b=-1;
            }
            a++;
        }
        while(a<l && '0'<=s.charAt(a) && s.charAt(a)<='9'){
            int d=s.charAt(a)-'0';
            if(c>(Integer.MAX_VALUE-d)/10){
                return (b==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            c=c*10+d;
            a++;
        }
        return b*c;
    }
}