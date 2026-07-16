class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        int max = Integer.MIN_VALUE;
        int l=0;
        int r=nums.length-1;
        while(n>0)
        {
            max = Math.max(max,nums[l]+nums[r]);
            l++;
            r--;
            n--;
        } 
        return max;
    }
}