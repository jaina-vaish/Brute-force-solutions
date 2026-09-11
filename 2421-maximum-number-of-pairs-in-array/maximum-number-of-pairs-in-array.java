class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer>  map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        for(Integer x:map.keySet())
        {

            if(map.get(x)>=2)
            {
                c+=map.get(x)/2;
            }
        }
        int arr[] = new int[2];
        arr[0] = c;
        arr[1] = nums.length-c*2;
        return arr;
    }
}