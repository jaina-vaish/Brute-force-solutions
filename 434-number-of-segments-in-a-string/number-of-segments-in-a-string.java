class Solution {
    public int countSegments(String s) {
        String sa[]=s.split(" ");
        int c=0;
        for(int i=0;i<sa.length;i++)
        {
            if(!sa[i].equals(""))
            {
                c++;
            }
          
        }
        return c;
    }
}