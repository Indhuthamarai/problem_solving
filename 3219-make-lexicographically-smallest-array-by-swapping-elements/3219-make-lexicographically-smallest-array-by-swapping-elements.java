class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        List<int[]> list = new ArrayList<>(); 
        for (int i = 0; i < n; i++) {
            list.add(new int[]{ nums[i], i });
        }
        Collections.sort(list, (a, b) -> a[0] - b[0]);
        int i = 0;
        while(i < n) {
            PriorityQueue<Integer> q = new PriorityQueue<>();
            int j = i;
            while(j < n && (j == i || list.get(j)[0] - list.get(j-1)[0] <= limit)) {
                q.add(list.get(j)[1]);
                j++;
            }
            while(i < j) {
                nums[q.poll()] = list.get(i)[0];
                i++;
            }
        }

        return nums;
    }
}
