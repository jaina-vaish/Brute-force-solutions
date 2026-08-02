class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        String s = n+"";
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put((ch-'0'),map.getOrDefault((ch-'0'),0)+1);
        }
        for(Integer x:map.keySet())
        {
            sum+=x*map.get(x);
        }
        return sum;
    }
}