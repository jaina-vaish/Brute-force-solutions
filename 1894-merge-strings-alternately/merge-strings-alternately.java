class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l=0,r=0;
        String max="";
        String min="";
        if(word1.length()>word2.length())
        {
            max=word1;
            min=word2;
        }
        else
        {
            min=word1;
            max=word2;
        }
        String s="";
        for(int i=0;i<min.length();i++)
        {
          
            s+=word1.charAt(l++);
            s+=word2.charAt(r++);

        }
        for(int i=min.length();i<max.length();i++)
        {
            s+=max.charAt(i);
        }
      
        return s;
        
    }
}