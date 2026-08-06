class Solution {
    public String stringHash(String s, int k) {
        // i=0;
        // substring(i,k)
        // i=k
        // substring(i,k)
        String res="";
        int first = 0;
        for(int i=0;i<s.length();i=i+k)
        {
            String str="";
            int sum=0;
            str+=s.substring(i,i+k);
            System.out.println(str);
            for(int j=0;j<str.length();j++)
            {
                sum+=(str.charAt(j)-'a');
            }
            sum=sum%26;
            char ch = (char)('a'+sum);
            res+=ch;
        }
        return res;
    }
}