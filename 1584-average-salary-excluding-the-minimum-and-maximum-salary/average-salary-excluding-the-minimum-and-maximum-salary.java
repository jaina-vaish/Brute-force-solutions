class Solution {
    public double average(int[] salary) {
        double sum=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<salary.length;i++)
        {
            sum+=salary[i];
            max=Math.max(salary[i],max);
            min=Math.min(salary[i],min);
        }
        sum=((sum-(max+min))/(salary.length-2));
        return sum;

    }
}