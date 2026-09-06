class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            String str=operations[i];
            if(str.equals("+"))
            {
               int num1=s.get(s.size()-1);
               int num2=s.get(s.size()-2);
               s.push(num1+num2);
            }
            else if(str.equals("D"))
            {
                int num=s.peek();
                s.push(2*num);

            }
            else if(str.equals("C"))
            {
                s.pop();
            }
            else
            {
                int n=Integer.parseInt(str);
                s.push(n);
            }
        }
        int sum=0;
        for(Integer x:s)
        {
            sum+=x;
        }
        return sum;
    }
}