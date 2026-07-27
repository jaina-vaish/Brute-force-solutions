class Solution {
    public String toGoatLatin(String sentence) {
        String sa[] = sentence.split(" ");
        int count=1;
        String result="";
        for(int i=0;i<sa.length;i++)
        {
            String str = sa[i];
            char ch = str.charAt(0);
            StringBuilder sb = new  StringBuilder(str);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                sb.append("ma");
            }
            else
            {
                sb.deleteCharAt(0);
                sb.append(ch);
                sb.append("ma");
            } 
            sb.append("a".repeat(count));
            count++;
            result=result+" "+sb.toString();
            
        }
        return result.trim();
    }
}