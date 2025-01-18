class Solution {
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int directions[][] = {{}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
        boolean visited[][] = new boolean[n][m];
        Deque<int[]> deque = new ArrayDeque<>();

        deque.offer(new int[]{0, 0, 0});

        while (!deque.isEmpty()) {
            int[] currPos = deque.poll();

            int row = currPos[0];
            int col = currPos[1];
            int cost = currPos[2];

            if (row == n - 1 && col == m - 1) {
                return cost;
            }

            if (visited[row][col]) continue;
            visited[row][col] = true;

            for (int i = 1; i <= 4; i++) {
                int dr = directions[i][0];
                int dc = directions[i][1];

                int nr = row + dr;
                int nc = col + dc;
                int ncost = (i == grid[row][col]) ? cost : cost + 1;

                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (i == grid[row][col]) {
                        deque.offerFirst(new int[]{nr, nc, ncost});
                    } else {
                        deque.offer(new int[]{nr, nc, ncost});
                    }
                }
            }
        }
        
        return Integer.MAX_VALUE;
    }
}