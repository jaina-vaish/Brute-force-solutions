class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++)
        {
            String str = names[i];
            map.put(heights[i],str);
        }
        int ind=0;
        String res[] = new String[names.length];
        for(Integer x:map.keySet())
        {
            res[ind++] = map.get(x);

        }
        return res;
    }
}