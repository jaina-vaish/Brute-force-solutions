class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Character  x:map.keySet())
        {
            if(map.get(x)%2==0)
            {
                ans=ans+2;
            }
            else
            {
                ans++;
            }
        }
        return ans;
    }
}