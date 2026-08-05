class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            if(!map.containsKey(t.charAt(i)))
            {
                return false;
            }
            else
            {
                char ch = t.charAt(i);
                map.put(ch,map.get(ch)-1);
                if (map.get(ch) == 0) {
                map.remove(ch);
                }
            }
        }
        if(s.length()!=t.length())
        {
            return false;
        }
        if(map.isEmpty())
        {
            return true;
        }
        else
        return false;
    }
}