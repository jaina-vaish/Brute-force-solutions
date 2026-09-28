class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,tens=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
            {
                five++;
            }
            else if(bills[i]==10)
            {
                if(five==0)
                return false;
                tens++;
                five--;
            }
            else 
            {
                if(five>0 && tens>0)
                {
                    five--;
                    tens--;
                }
                else if(five>=3)
                {
                    five=five-3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}
