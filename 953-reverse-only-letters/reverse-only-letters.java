class Solution {
    public String reverseOnlyLetters(String s) {
        ArrayList<Character> list = new ArrayList<>();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                list.add(s.charAt(i));
            }
        }
        Collections.reverse(list);
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
           if(Character.isLetter(ch))
           {
                str+=list.get(k);
                k++;
           }
           else
           {
                str+=ch;
           }
        }
        return str;
    }
}