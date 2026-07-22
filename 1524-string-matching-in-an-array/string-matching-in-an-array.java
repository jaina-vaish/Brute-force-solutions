class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s1 = words[i];
            for(int j=0;j<words.length;j++)
            {
                String s2 = words[j];
                boolean flag = s2.contains(s1) && i!=j;
                if(flag)
                {
                    if(!list.contains(s1))
                    {
                        list.add(s1);
                    }
                }
                
            }
        }
        return list;
    }
}