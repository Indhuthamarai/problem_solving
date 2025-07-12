class Solution {
    public int romanToInt(String s) {
         Map<Character, Integer> Roman = Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
        );
        if(s.length() == 0) return 0;
        if(s.length() == 1) return Roman.get(s.charAt(0));

        Integer first = Roman.get(s.charAt(0));
        Integer second = Roman.get(s.charAt(1));

        if (first < second) {
            return second - first + romanToInt(s.substring(2));
        } else {
            return first + romanToInt(s.substring(1));
        }
    }
}