class Solution {
    public long countSubstrings(String s, char c) {
        long count=0;
        // for(int i=0;i<s.length();i++)
        // {
        //     for(int j=i;j<s.length();j++)
        //     {
        //         String str = "";
        //         for(int k=i;k<=j;k++)
        //         {
        //            str+= s.charAt(k);
        //         }
        //         System.out.print(str);
        //         if(str.charAt(0)==c && str.charAt(str.length()-1)==c)
        //         {
        //             count++;
        //         }
        //     }
        //}

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }

        return count*(count+1)/2;
    }
}