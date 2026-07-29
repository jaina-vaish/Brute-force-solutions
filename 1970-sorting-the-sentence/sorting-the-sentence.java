class Solution {
    public String sortSentence(String s) {
        String sa[] = s.split(" ");
        String res="";
        for(int i=0;i<sa.length;i++)
        {
            for(int j=0;j<sa.length-1-i;j++)
            {
            String str = sa[j];
            String str1 = sa[j+1];
            if(str.charAt(str.length()-1)>str1.charAt(str1.length()-1))
            {
                String temp = "";
                temp = sa[j];
                sa[j] = sa[j+1];
                sa[j+1] = temp;
            }
            }
        }
        for(int i=0;i<sa.length;i++)
        {
            StringBuilder sb = new StringBuilder(sa[i]);
            sb.deleteCharAt(sb.length()-1);
            res=res+" "+sb;
        }  
        
        
        System.out.print(Arrays.toString(sa));
        return res.trim();
    }
}