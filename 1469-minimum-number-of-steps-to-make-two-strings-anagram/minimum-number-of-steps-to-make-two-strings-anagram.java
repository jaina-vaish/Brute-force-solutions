class Solution {
    public int minSteps(String s, String t) {
        // s:  l e t c o d
        //     1 3 1 1 1 1

        // t:  p r a c t i e
        //     1 1 1 2 1 1 1

        // p1 r1 a1 c1 i1 
        // if p from t is thee in sornot if yes freuencies check
        // if fr from t = p ok t>p ans++ if not in s ans+=fre

        int ans=0;
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        // for(int i=0;i<t.length();i++)
        // {
        //     char ch = t.charAt(i);
        //     if(!smap.containsKey(ch))
        //     {
        //         ans+=tmap.get(ch);
        //     }
        //     else if(!tmap.get(ch).equals(smap.get(ch)))
        //     {
        //         int fr1 = tmap.get(ch);
        //         int fr2 = smap.get(ch);
        //         if(fr1>fr2)
        //         {
        //             ans+=fr1-fr2;
        //         }
        //     }
            for (char ch : tmap.keySet()) 
            {
            int fr1 = tmap.get(ch);
                if(!smap.containsKey(ch))
                {
                    ans += fr1;
                } 
                else if (fr1 > smap.get(ch))
                {
                    ans += fr1 - smap.get(ch);
                }
            }
            return ans;
       
    }
}