class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i%2==1)
            {
                int digit = s.charAt(i)-'0';
                char ch = (char)(s.charAt(i-1)+digit);
                sb.append(ch);
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}