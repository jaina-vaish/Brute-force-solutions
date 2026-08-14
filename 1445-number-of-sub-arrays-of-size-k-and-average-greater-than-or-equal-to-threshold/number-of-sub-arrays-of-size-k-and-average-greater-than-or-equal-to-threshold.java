class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        for(int i=0;i<=arr.length-k;i++)
        {
            double avg=0;
            double sum=0;
            for(int j=0;j<k;j++)
            {
                sum+=arr[i+j];
            }
            avg=sum/k;
            if(avg>=threshold){
                c++;
            }
        }
        return c;
    }
}