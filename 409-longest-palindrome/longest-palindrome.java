class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int length = 0;
        boolean odd = false;

        for (Character x : map.keySet()) {
            int count = map.get(x);

            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                odd = true;
            }
        }

        if (odd) {
            length++;
        }
        return length;
    }
}