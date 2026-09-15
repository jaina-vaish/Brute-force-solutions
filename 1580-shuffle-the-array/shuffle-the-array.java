class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=0;
        int r=n;
        int arr[] = new int[nums.length];
        int k=0;
        while(r!=nums.length)
        {
            if(k%2==0)
            {
                arr[k]=nums[l];
                l++;
            }
            else
            {
                arr[k]=nums[r];
                r++;
            }
            k++;
        }
        return arr;
    }
}