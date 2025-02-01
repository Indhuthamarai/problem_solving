class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int l=strs.length;
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String res=String.valueOf(c);
            if(!map.containsKey(res)){
                map.put(res,new ArrayList<>());
            }
            map.get(res).add(s);
        }
        return new ArrayList<>(map.values());
    }
}