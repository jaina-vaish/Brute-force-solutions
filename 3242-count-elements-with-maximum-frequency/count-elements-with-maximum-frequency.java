class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Integer x:map.keySet())
        {
            max = Math.max(map.get(x),max);
        }
        int ans = 0;

    for (Integer x : map.keySet()) 
    {
        if (map.get(x) == max)
        {
            ans += map.get(x);
        }
    }

return ans;
        
    }
}