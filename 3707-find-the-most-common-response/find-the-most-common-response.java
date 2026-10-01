class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        for(List<String> x : responses) 
        {
            HashSet<String> set=new HashSet<>();
            for(String str : x) 
            {
                //System.out.println(str);
                set.add(str);
            }
            for(String y:set)
            {
                //System.out.println(y);
                map.put(y,map.getOrDefault(y,0)+1);
            }
        }
        int max=0;
        for(String x:map.keySet())
        {
            if(map.get(x)>max)
            {
                max=map.get(x);
            }
        }
        ArrayList<String> list=new ArrayList<>();
        for(String x:map.keySet())
        {
            if(map.get(x)==max)
            {
                list.add(x);
            }
        }
        String smallest = list.get(0);

for(int i = 1; i < list.size(); i++) {
    if(list.get(i).compareTo(smallest) < 0) {
        smallest = list.get(i);
    }
}
return smallest;
    }

}
