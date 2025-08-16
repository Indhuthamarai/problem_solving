class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid.length==0)
        {
            return -1;
        }
        int m=grid.length;
        int n=grid[0].length;
        int freshOranges=0,minutes=0;
        boolean found=false;
        Queue<int[]> q=new LinkedList<>();
        int[][] direction={{-1,0},{0,-1},{1,0},{0,1}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    freshOranges++;
                }
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty() && freshOranges>0)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
            int[] a=q.poll();
            found=false;
            for(int[] d:direction)
            {
                int x=a[0]+d[0];
                int y=a[1]+d[1];
                if(x>-1 && x<m && y>-1 && y<n && grid[x][y]==1)
                {
                    q.offer(new int[]{x,y});
                    grid[x][y]=2;
                    freshOranges--;
                }
            }
            }
            minutes++;
        }
        return freshOranges==0?minutes:-1;
    }
}