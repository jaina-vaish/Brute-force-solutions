class Solution {
    public String capitalizeTitle(String title) {
        String sa[] = title.split(" ");
        String res="";
        for(int i=0;i<sa.length;i++)
        {
            String s = sa[i];
            if(s.length()>=3)
            {
                s=s.toLowerCase();
                 s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
            }
            else
            {
                s=s.toLowerCase();
            }
        res = res+" "+s;
        }
        return res.trim();
    }
}