class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        
        for (int num : arr) {
            if (s.contains(2 * num) || (s.contains(num/2)&& num%2==0 )) {
                return true;
            }
            s.add(num);
        }
        
        return false;
    }
}
