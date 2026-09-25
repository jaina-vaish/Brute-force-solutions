class Solution {
    public int countCharacters(String[] words, String chars) {
       HashMap<Character,Integer> map=new HashMap<>();
       int c=0;
       for(int i=0;i<chars.length();i++)
       {
        char ch=chars.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(int i=0;i<words.length;i++)
       {
            String n=words[i];
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int j=0;j<n.length();j++)
            {
                map1.put(n.charAt(j),map1.getOrDefault(n.charAt(j),0)+1);
            }
            boolean flag=true;
            for(Character x:map1.keySet())
            {
                if(map.getOrDefault(x,0)<map1.get(x))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                c+=n.length();
            }
       }
       return c;
        
    }
}