class Solution {
    public int generateKey(int num1, int num2, int num3) {
     String n1 = String.format("%04d", num1);
     String n2 = String.format("%04d", num2);
     String n3 = String.format("%04d", num3);
     String n4="";
            int min = 0;
              for(int i=0;i<n1.length();i++)
              {
                    min = Math.min( n1.charAt(i)-'0',(Math.min( n2.charAt(i)-'0',n3.charAt(i)-'0')));
                    n4+=min;
              }
              return Integer.parseInt(n4);
    }
}