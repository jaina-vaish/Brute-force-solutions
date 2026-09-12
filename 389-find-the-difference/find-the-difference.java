class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        char res=' ';
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch1=t.charAt(i);
            map.put(ch1,map.getOrDefault(ch1,0)-1);
        }
        for(Character x:map.keySet())
        {
            if(map.get(x)<0)
            {
                res=x;
            }
            System.out.println(x+" "+map.get(x));
        }
        return res;
    }
}