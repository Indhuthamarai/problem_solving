class Solution {
    public String reverseVowels(String s) {
        int j=0;
        String Reversed="";
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
                Reversed+=a.get(j);
                j++;
            }
            else{
                Reversed+=s.charAt(i);
            }
        }
        return Reversed;
    }
}