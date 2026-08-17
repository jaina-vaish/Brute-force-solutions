class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        StringBuilder sb = new StringBuilder();
        int l=0;
        int r=0;
        int k=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch = moves.charAt(i);
            if(ch=='L')
            {
                l++;
            }
            else if(ch=='R')
            {
                r++;
            }
            else
            {
                k++;
            }
        }
       
            
        return Math.max(l,r)+k-Math.min(l,r);
    }
}