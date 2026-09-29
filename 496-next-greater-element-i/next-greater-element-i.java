class Solution {
    static int ind(int arr[],int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                return i;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++)
        {
            boolean flag=false;
            int original=nums1[i];
            int index=ind(nums2,original);
            for(int j=index;j<nums2.length;j++)
            {
                if(original<nums2[j])
                {
                    flag=true;
                    arr[i]=nums2[j];
                    break;
                }
            }
            if(!flag)
            arr[i]=-1;
        }
        return arr;
    }
}