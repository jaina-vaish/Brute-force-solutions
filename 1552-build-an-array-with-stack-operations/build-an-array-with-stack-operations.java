class Solution {
    static boolean belongsTo(int []arr,int tar)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tar)
            {
                return true;
            }
        }
        return false;
    }
    public List<String> buildArray(int[] target, int n) {
        
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i>target[target.length-1])
            {
                break;
            }
          boolean b = belongsTo(target,i);
          if(b)
          {
            list.add("Push");
          }
          else
          {
            list.add("Push");
            list.add("Pop");
          }
        }
        return list;
    }
}