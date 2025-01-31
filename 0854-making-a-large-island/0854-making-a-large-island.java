class Solution {
    public int largestIsland(int[][] grid) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=grid.length;
        map.put(0,0);
        int id=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    int area=getArea(grid,i,j,id);
                    map.put(id,area);
                    id++;
                }
            }
        }
        int res=map.getOrDefault(2,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    Set<Integer> s=new HashSet<>();
                    s.add(i>0 ? grid[i-1][j]:0);
                    s.add(i<n-1 ? grid[i+1][j]:0);
                    s.add(j>0 ? grid[i][j-1]:0);
                    s.add(j<n-1 ? grid[i][j+1]:0);
                    int totArea=1;
                    for(int a:s){
                        totArea+=map.get(a);
                        res=Math.max(res,totArea);
                    }

                }
            }
        }
        return res;
    }
    public int getArea(int[][] grid,int i,int j,int id){
        if(i<0 || j<0 || i>=grid.length || j>=grid.length || grid[i][j]!=1) return 0;
        grid[i][j]=id;
        return 1 +  getArea(grid,i-1,j,id)+getArea(grid,i+1,j,id)+getArea(grid,i,j-1,id)+getArea(grid,i,j+1,id);

    }
}