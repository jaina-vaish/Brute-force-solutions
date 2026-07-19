class Solution {
    public boolean judgeCircle(String moves) {
        // up +1
        // down -1
        // right +1
        // left -1
        int res=0;
        int c=0;
        int d=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch = moves.charAt(i);
            if(ch=='U')
            {
                c+=1;
            }
            else if(ch=='D')
            {
                c-=1;
            }
            else if(ch=='L')
            {
                d-=1;
            }
            else
            {
                d+=1;
            }
        }
        if(c==0 && d==0)
        {
            return true;
        }
        else
        return false;
    }
}