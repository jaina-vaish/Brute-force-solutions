class Solution {
    static int rev(int n)
    {
        int res=0;
        while(n>0)
        {
            int rem = n%10;
            res=res*10+rem;
            n=n/10;
        }
        return res;
    }
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<num;i++)
        {
            if(i+rev(i)==num)
            {
                return true;
            }
        }
        if(num==0)
        {
            return true;
        }
        return false;
    }
}