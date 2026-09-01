class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int c=0;
        int max=0;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<points.length;i++)
        {
            for(int j=0;j<points[i].length;j++)
            {
                c++;
                if(c%2==1)
                {
                    list.add(points[i][j]);
                }
            }
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++)
        {
            int diff=Math.abs(list.get(i)-list.get(i+1));
            max = Math.max(diff,max);
        }
        return max;
    }
}