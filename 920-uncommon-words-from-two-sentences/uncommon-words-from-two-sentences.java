class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String sa[] = s1.split(" ");
        String sa1[] = s2.split(" ");
        for(int i=0;i<sa.length;i++)
        {
            map.put(sa[i],map.getOrDefault(sa[i],0)+1);
        }
        for(int j=0;j<sa1.length;j++)
        {
             map.put(sa1[j],map.getOrDefault(sa1[j],0)+1);
        }
        
        ArrayList<String> list = new ArrayList<>();
         
        for(String x:map.keySet())
        {
            if(map.get(x)==1)
            {
               // System.out.println(x);
               list.add(x);
            }
        }
        String arr[] = new String[list.size()];
        int k=0;
        for(String y:list)
        {
            arr[k] = y;
            k++;
        }

        return arr;
    }
}