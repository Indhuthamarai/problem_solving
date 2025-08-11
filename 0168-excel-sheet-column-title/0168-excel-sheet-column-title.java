class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            n--;
            int r=n%26;
            sb.append((char)(r+'A'));
            n=n/26;
        }
        return sb.reverse().toString();
        
    }
}