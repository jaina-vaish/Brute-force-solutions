class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = n+"";
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
           arr[i] = (s.charAt(i)-'0');
        }
        int min=Integer.MAX_VALUE;
        int num = 0;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if (c < min)
            {
                 min = c;
                 num = arr[i];
            }
            else if (c == min)
             {
             num = Math.min(num, arr[i]);
            }
        }

    return num;

    }
}