class Solution {
    public int minBitFlips(int start, int goal) {
        String s=Integer.toBinaryString(start);
        String e=Integer.toBinaryString(goal);
         int c=0;
        int k=0;
        if(s.length()>e.length())
        {  
        int n=s.length()-e.length();
        for(int i=0;i<n;i++)
        {
            e='0'+e;
        }
        
    }
    else
    {
         int n=e.length()-s.length();
        for(int i=0;i<n;i++)
        {
            s='0'+s;
        }
    }
        for(int i=0;i<Math.max(s.length(),e.length());i++)
        {
            char ch = s.charAt(i);
            char ch1 = e.charAt(i);
            if(ch!=ch1)
            {
                c++;
            }
        }
       
       return c;
    }
}