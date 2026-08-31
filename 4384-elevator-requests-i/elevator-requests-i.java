class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int floor =0;
        int sum=0;
        for(int i=0;i<requests.length;i++)
        {
            int num = requests[i];
            sum+=Math.abs(floor-num);
            floor=num;
        }
        return sum;
    }
}