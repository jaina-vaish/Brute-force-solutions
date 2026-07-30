class Solution {
    static int count(String word)
    {
        int c=0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                c++;
            }
        }
        return c;
    }
    public String reverseWords(String s) {
        String sa[] = s.split(" ");
        String res = "";
        res+=sa[0];
        int firstword = count(sa[0]);
        for(int i=1;i<sa.length;i++)
        {
            if(firstword==count(sa[i]))
            {
                 String append ="";
                 String sec = sa[i];
                for(int j=sec.length()-1;j>=0;j--)
                {
                    char ch1 = sec.charAt(j);
                    append = append+ch1;
                }
                res=res+" "+append;
            }
            else
            {
                res=res+" "+sa[i];
            }
        }
        
        return res.trim();
        
    }
}