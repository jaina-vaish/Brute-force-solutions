class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<=s.length()-3;i++)
        {
           ArrayList<Character> list = new ArrayList<>();
            for(int j=0;j<3;j++)
            {
               if(!list.contains(s.charAt(i+j)))
               {
                    list.add(s.charAt(i+j));

               }
               else
               {
                break;
               }
            }
            if(list.size()==3)
            {
                c++;
            }
            System.out.println(list);
        }
        return c;
    }
}