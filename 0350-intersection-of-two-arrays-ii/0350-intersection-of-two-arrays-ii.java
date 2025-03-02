class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i,j,c=0;
        int num[]=new int[Math.min(nums1.length,nums2.length)];
        for(i=0;i<nums1.length;i++)
        {
            for(j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    num[c++]=nums1[i];
                    nums2[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }
            int result[]=new int[c];
            for(i=0;i<c;i++){
                result[i]=num[i];
            }
        
        return result;
        
    }
}
