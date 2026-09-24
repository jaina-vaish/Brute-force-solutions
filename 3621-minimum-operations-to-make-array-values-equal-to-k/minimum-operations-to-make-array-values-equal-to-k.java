class Solution {
    public int minOperations(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
            list.add(nums[i]);
        }
        for(Integer x:list)
        {
            if(x<k)
            return -1;
            if(x>k)
            c++;
        }
        return c;
    }
}