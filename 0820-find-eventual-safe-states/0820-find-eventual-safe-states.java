class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        int n = graph.length;
        for(int i=0; i<n; i++){
           if(dfs(i, graph, map)) {
               li.add(i);
           }
        }
        return li;
    }

    public boolean dfs(int node , int[][] graph, HashMap<Integer, Boolean> map){
        if(map.containsKey(node)){
            return map.get(node);
        }

        map.put(node, false);
        for(int neighbour : graph[node]){
            if(!dfs(neighbour, graph, map)){
                return false;
            }
        }

        map.put(node, true);
        return true;
    }
}