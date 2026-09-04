class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0;
        for(String x:commands)
        {
            if(x.equals("RIGHT"))
            {
                j++;
            }
            else if(x.equals("LEFT"))
            {
                j--;
            }
            else if(x.equals("UP"))
            {
                i--;
            }
            else
            {
                i++;
            }
        }
        return i*n+j;
    }
}