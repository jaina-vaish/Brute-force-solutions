class Solution {
    public int countWords(String[] words1, String[] words2) {
        int ans=0;
        for(int i=0;i<words1.length;i++)
        {
            int c=0;
            for(int j=0;j<words1.length;j++)
            {
                if(words1[i].equals(words1[j]))
                {
                    c++;
                }
            }
            if(c==1)
            {
                int pc=0;
                for(int k=0;k<words2.length;k++)
                {
                    if(words1[i].equals(words2[k]))
                    {
                        pc++;
                    }
                }
                if(pc==1)
                {
                    ans++;
                }
            }
        }
        return ans;
    }
}