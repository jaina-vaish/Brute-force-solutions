class Solution {
    static String rev(String s)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            ans=ch+ans;
        }
        return ans;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String str = words[i];
            for(int j=i+1;j<words.length;j++)
            {
                String str1 = words[j];
                String rev_str = rev(str1);
                if(str.equals(rev_str))
                {
                    c++;
                }
            }
        }
        return c;
    }
}