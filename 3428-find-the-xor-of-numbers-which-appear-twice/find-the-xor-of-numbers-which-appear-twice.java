class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer x:map.keySet())
        {
            System.out.println(x+" "+map.get(x));
            
            if(map.get(x)>1)
            {
                list.add(x);
            }
            
        }
        int xor=0;
        if(list.size()>1)
        {
            for(Integer x:list)
            {
            xor=xor^x;
            }
            return xor;
        }
        else if(list.size()==1)
        {
            return list.get(0);
        }
       else
       return 0;
    }
}