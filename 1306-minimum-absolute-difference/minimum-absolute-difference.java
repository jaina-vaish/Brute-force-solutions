class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        ArrayList<List<Integer>> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=arr[i+1]-arr[i];
            min=Math.min(diff,min);
        }
        for(int i=0;i<arr.length-1;i++)
        {
           ArrayList<Integer>res=new ArrayList<>();
           int c=1;
            if(arr[i+1]-arr[i]==min)
            {
               res.add(arr[i]);
               res.add(arr[i+1]);
               c=0;
            }
            if(c==0)
            list.add(res);
        }
        return list;
    }
}