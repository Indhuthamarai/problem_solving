class Solution {
    public boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        StringBuilder reversed=new StringBuilder(s);
        while(l<r)
        {
            char lowerL=Character.toLowerCase(s.charAt(l));
            char lowerR=Character.toLowerCase(s.charAt(r));
            if(isVowel(lowerL)&& isVowel(lowerR))
            {
                reversed.setCharAt(l,s.charAt(r));
                reversed.setCharAt(r,s.charAt(l));
                l++;
                r--;
            }
            else if(isVowel(lowerL)||isVowel(lowerR))
            {
               if(!isVowel(lowerL))
               {
                l++;
               }
               else{
                r--;
               }
            }
            else{
                l++;
                r--;
            }
        }
        return reversed.toString();
    }
}