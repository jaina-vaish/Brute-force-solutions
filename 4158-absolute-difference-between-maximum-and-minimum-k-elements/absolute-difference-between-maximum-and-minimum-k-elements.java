class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int lsum=0;
        int hsum=0;
        int l=0;
        int r=nums.length-1;
        for(int i=1;i<=k;i++)
        {
            lsum+=nums[l];
            l++;
            hsum+=nums[r];
            r--;
        }
        return Math.abs(lsum-hsum);
    }
}