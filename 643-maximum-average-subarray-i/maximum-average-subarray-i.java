class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ca=0;
        double ma=-Double.MAX_VALUE;
        
        for(int i=0,j=0;j<nums.length;j++)
        {
            ca+=nums[j];
            if(j-i+1==k)
            {
             
                ma=Math.max(ma,ca/k);
                ca-=nums[i++];
            }
        }
        return ma;
    }
}