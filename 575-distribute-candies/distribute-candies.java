class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
            set.add(candyType[i]);
        }
        int she_can_have=candyType.length/2;
        int kinds=set.size();
        if(kinds>she_can_have)
        {
            return she_can_have;
        }
        else
        return kinds;
    }
}