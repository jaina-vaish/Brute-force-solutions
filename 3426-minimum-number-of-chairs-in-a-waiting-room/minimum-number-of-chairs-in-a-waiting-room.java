class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            {
                c+=1;
            }
            else
            {
                c-=1;
            }
            max = Math.max(max,c);
        }
        return max;
    }
}