class Solution {
    public char repeatedCharacter(String s) {
        ArrayList<Character> list=new ArrayList<>();
        char res=' ';
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!list.contains(ch))
            {
                list.add(ch);
            }
            else
            {
                res=ch;
                break;
            }
        }
        return res;
    }
}