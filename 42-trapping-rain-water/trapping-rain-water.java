class Solution {
    public int trap(int[] height) {
        // int max=0;
        // for(int i=0;i<height.length;i++)
        // {
        //     int lh = height[i];
        //     for(int j=0;j<i;j++)
        //     {
        //         lh=Math.max(lh, height[j]);
        //     }
        //     int rh= height[i];
        //     for(int j=i+1;j< height.length;j++)
        //     {
        //         rh = Math.max(rh, height[j]);
        //     }
        //     max += Math.min(lh,rh)- height[i]; 

        // }
        // return max;



        int n = height.length;
        int tc=0;
        int l=1,r=n-2;
        int lh = height[0],rh = height[n-1];
        while(l<=r)
        {
            if(lh<rh)
            {
                if(height[l]<lh)
                {
                    tc+=lh-height[l++];
                }
                else
                {
                    lh = height[l++];
                }
            }
            else
            {
                if(height[r]<rh)
                {
                    tc+=rh-height[r--];
                }
                else
                {
                    rh = height[r--];
                }
            }
        }
        return tc;

    }
}