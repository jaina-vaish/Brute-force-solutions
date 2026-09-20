class Solution {
    public int minLengthAfterRemovals(String s) {
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                s1++;
            }
            else
            {
                s2++;
            }
        }
        return Math.abs(s1-s2);
    }
}