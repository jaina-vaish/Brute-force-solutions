class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = Integer.MIN_VALUE;
        int arr[] = new int[2];
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                arr[0] =i; 
            }
        }
        arr[1] = max;
        return arr;
    }
}