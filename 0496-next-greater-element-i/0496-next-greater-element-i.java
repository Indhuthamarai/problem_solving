class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Map<Integer,Integer> m=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        s.push(nums2[0]);
        for(int i=1;i<n2;i++){
            while(!s.isEmpty() && s.peek()<=nums2[i]){
                m.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()){
            m.put(s.pop(),-1);
        }
        for(int i=0;i<n1;i++){
            nums1[i]=m.get(nums1[i]);
        }
        return nums1;
    }
}