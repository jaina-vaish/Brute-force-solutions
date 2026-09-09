class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        HashSet<Integer> s3=new HashSet<>();
        for(Integer x: nums1)
        {
            s1.add(x);
        }
        for(Integer x: nums2)
        {
            s2.add(x);
        }
        for(Integer x: nums3)
        {
            s3.add(x);
        }

      for(Integer x:s1)
      {
            map.put(x,map.getOrDefault(x,0)+1);
      }
      for(Integer x:s2)
      {
            map.put(x,map.getOrDefault(x,0)+1);
      }
     for(Integer x:s3)
      {
       
            map.put(x,map.getOrDefault(x,0)+1);
      }
      ArrayList<Integer> list=new ArrayList<>();
      for(Integer x:map.keySet())
      {
        System.out.println(x+" "+map.get(x));
        if(map.get(x)>=2)
        {
            list.add(x);
        }
      }
      
      return list;

    }
}