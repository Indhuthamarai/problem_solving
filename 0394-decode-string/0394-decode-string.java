class Solution {
    public String decodeString(String s) {
        Stack<Integer> st1=new Stack<>();
        Stack<StringBuilder> st2=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int n=0;
        for(char c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                n=n*10+c-'0';
            }
            else if(c=='[')
            {
                st1.push(n);
                n=0;
                st2.push(sb);
                sb=new StringBuilder();
            }
            else if(c==']')
            {
                int k=st1.pop();
                StringBuilder temp=sb;
                sb=st2.pop();
                while(k-->0)
                {
                    sb.append(temp);
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}