class Solution {
    public String reverseVowels(String s) {
        StringBuilder Reversed=new StringBuilder(s);
        StringBuilder a=new StringBuilder();
        for(char c:s.toCharArray())
        {
            char ch=Character.toLowerCase(c);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                a.append(c);
            }
        }
        int j=a.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char lower=Character.toLowerCase(s.charAt(i));
            if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
            {
                Reversed.setCharAt(i,a.charAt(j--));
            }
            
        }
        return Reversed.toString();
    }
}