class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char alpha='a';
        String ans="";
        for(int i=0;i<key.length();i++)
        {
            char ch=key.charAt(i);
            if(ch!=' ')
            {
            if(!map.containsKey(ch))
            {
                map.put(ch,alpha);
                alpha++;
            }
            }
        }
        for(int i=0;i<message.length();i++)
        {
            char ch = message.charAt(i);
            if(ch==' ')
            {
                ans+=" ";
            }
            else
            {
                ans+=map.get(ch);
            }
        }
        return ans;
    }
}