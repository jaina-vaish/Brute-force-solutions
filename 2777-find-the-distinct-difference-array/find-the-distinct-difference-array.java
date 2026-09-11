class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> pref=new HashSet<>();
            for(int j=0;j<=i;j++)
            {
                pref.add(nums[j]);
            }
            HashSet<Integer> suf=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                suf.add(nums[j]);
            }
            arr[i] = pref.size()-suf.size();
        }
        return arr;
    }
}