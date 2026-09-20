class Solution {
    public int countValidPrefixes(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
             int one=0,zero=0;
            for(int j=0;j<=i;j++)
            {
                if(s.charAt(j)=='1')
                {
                    one++;
                }
                else
                {
                    zero++;
                }
            }
            if(Math.abs(one-zero)<=1)
            {
                ans++;
            }
        }
        return ans;
    }
}