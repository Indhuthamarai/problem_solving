class Solution {
    public String reverseVowels(String s) {
        int j=0;
        StringBuilder Reversed=new StringBuilder();
        ArrayList<Character> a=new ArrayList<>();
        for(char c:s.toCharArray())
        {
            char ch=Character.toLowerCase(c);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                a.add(c);
            }
        }
        Collections.reverse(a);
        for(int i=0;i<s.length();i++)
        {
            char lower=Character.toLowerCase(s.charAt(i));
            if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
            {
                Reversed.append(a.get(j));
                j++;
            }
            else{
                Reversed.append(s.charAt(i));
            }
        }
        return Reversed.toString();
    }
}