class Solution {
    public int diagonalPrime(int[][] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(i==j)
                {
                   list.add(nums[i][j]);
                }
                else if(i+j==nums.length-1)
                {
                    list.add(nums[i][j]);
                }
                
            }
        }
        int max = 0;
        for(Integer x:list)
        {
            int c=0;
            for(int i=2;i<=Math.sqrt(x);i++)
            {
                if(x%i==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                max = Math.max(max,x);
            }
        }
        System.out.print(list);
        if(list.contains(1) && list.size()==1)
        {
            return 0;
        }
        return max;
    }
}