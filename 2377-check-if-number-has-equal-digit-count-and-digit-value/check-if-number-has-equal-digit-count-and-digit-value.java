class Solution {
    public boolean digitCount(String num) {
   
        for(int i=0;i<num.length();i++)
        {
            int c=0;
            for(int j=0;j<num.length();j++)
            {
                if((i+'0')==num.charAt(j))
                {
                    c++;
                }
            }
            if(num.charAt(i)!=c+'0')
            {
                return false;
            }
        }
        return true;
    }
}