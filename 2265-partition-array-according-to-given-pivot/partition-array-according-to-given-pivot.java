class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       ArrayList<Integer> slist = new ArrayList<>();
         ArrayList<Integer> blist = new ArrayList<>();
         int p=0;
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]<pivot)
            {
                slist.add(nums[i]);
            }
            else if(nums[i]>pivot)
            {
                blist.add(nums[i]);
            }
            else
            {
                p++;
            }
         }
        int arr[] = new int[nums.length];
        int k=0;
        for(int i=0;i<slist.size();i++)
        {
            arr[k++] = slist.get(i);
        }
        for(int i=0;i<p;i++)
        {
            arr[k++] = pivot;
        }
        for(int i=0;i<blist.size();i++)
        {
            arr[k++] = blist.get(i);
        }


        
        return arr;
    }
}