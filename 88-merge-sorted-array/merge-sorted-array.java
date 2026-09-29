class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r=0;
       for(int i=0;i<nums1.length;i++)
       {
         if(r==n)
                {
                    break;
                }
           else if(nums1[i]==0)
            {
                nums1[i]=nums2[r]; 
                 
               
              r++;
            }
       }
     Arrays.sort(nums1);
    }
}