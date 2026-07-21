class Solution {
    public int[] scoreValidator(String[] events) {
        int score =0;
        int counter=0;
        for(int i=0;i<events.length;i++)
        {
            String s = events[i];
            if(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || 
            s.equals("4") || s.equals("5") || s.equals("6"))
            {
                int n = Integer.parseInt(s);
                score+=n;
            }
            else if(s.equals("W"))
            {
                counter+=1;
                if(counter==10)
                {
                    break;
                }
            }
            else
            {
                score+=1;
            }

        }
        return new int[] {score,counter};
    }
}