class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int arr[] = new int[2];
        int c=0;
        for(int i=0;i<nums1.length;i++)
        {
            int n = nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                int n1 = nums2[j];
                if(n==n1)
                {
                    c++;
                    break;
                }
            }
        }
        int c1=0;
        for(int i=0;i<nums2.length;i++)
        {
            int n = nums2[i];
            for(int j=0;j<nums1.length;j++)
            {
                int n1 = nums1[j];
                if(n1==n)
                {
                    c1++;
                    break;
                }
            }
        }
        arr[1] = c1;
        arr[0] = c;
        return arr;
    }
}