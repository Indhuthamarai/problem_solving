class Solution {
    public boolean isVowel(char c)
    {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char[] str=s.toCharArray();
        while(l<r)
        {
            char lowerL=Character.toLowerCase(str[l]);
            char lowerR=Character.toLowerCase(str[r]);
            if(isVowel(lowerL)&& isVowel(lowerR))
            {
                char temp=str[l];
                str[l]=str[r];
                str[r]=temp;
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
        return new String(str);
    }
}