class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int i,c=1,m;
        for(i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
            }
            else{
                c=1;
            }
            if(c<3){
            sb.append(s.charAt(i));
           }
        }
        return s.charAt(0)+sb.toString();
    }
}