class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = num+"";
        int count=0;
        for(int i=0;i<=s.length()-k;i++)
        {
            int n=0;
            for(int j=0;j<k;j++)
            {
                n=n*10+(s.charAt(i+j)-'0');
            }
            if(n!=0 && num%n==0)
            {
              count++;
            }
        }
       return count;
    }
}