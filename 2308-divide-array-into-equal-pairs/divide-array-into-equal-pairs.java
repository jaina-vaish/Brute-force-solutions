class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int x:map.values())
        {
            if(x%2==1)
            {
                return false;
            }
        }
        return true;
    }
}