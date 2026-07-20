class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String [] s = text.split(" ");
        int co=0;
       
         for(int j=0;j<s.length;j++)
         {
            boolean flag = true;
            String str = s[j];
            for(int i=0;i<brokenLetters.length();i++)
            {
                char c = brokenLetters.charAt(i);
                if(str.contains(String.valueOf(c)))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                co++;
            }
        }
        return co;
    }
}